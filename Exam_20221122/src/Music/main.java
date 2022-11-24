package Music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class main {
	public static void main(String[] args) {
		DataDAO dao = DataDAO.newInstance();
		Bugs m = new Bugs();

		if (dao.tableCheck() == false) {
			dao.tableCreated();
		} else {
			dao.initialization();
		} // 테이블, SEQUENCE 초기화

		if (dao.myTableCheck() == false) {
			dao.myTableCreated();
		} else {
		}

		m.crawling();

		int key;
		Boolean end = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("음악 실시간 TOP100 차트 & MyPlaylist 프로그램");

		while (end) {
			System.out.println();
			System.out.println("1.List 보기 2.검색 3.음악 추가 4.수정 5.삭제 6.MyPlaylist 추가 7.종료");
			System.out.print("원하는 기능을 숫자로 입력 해주세요: ");
			key = scanner.nextInt();

			if (key == 1) { // List 보기
				while (true) {
					System.out.println();
					System.out.println("1.TOP100 차트 2.추가List 3.MyList (0.이전메뉴)");
					System.out.print("입력: ");
					int value = scanner.nextInt();

					if (value == 0) { //메뉴
						break;
					} else if (value == 1) { //TOP100 차트
						dao.getMusic();
						break;
					} else if (value == 2) { //추가List
						List<List<String>> tmp = dao.addPrintMusic();
						if (tmp.isEmpty()) {
							System.out.println("추가된 곡이 없습니다.");
						} else {}
						break;
					} else if (value == 3) { //MyList
						List<List<String>> tmp = dao.getMyMusic();
						if (tmp.isEmpty()) {
							System.out.println("MyPlaylist가 비어있습니다.");
						} else {}
						break;
					} else {
						System.out.println("오!류");
						break;
					}
				}
			}

			else if (key == 2) { // 검색
				System.out.println();
				System.out.println("곡, 가수(그룹), 앨범 택1 검색 가능. (0.이전메뉴)");
				System.out.print("입력: ");
				scanner.nextLine();
				String[] music = (scanner.nextLine()).split(",");

				if (music[0].equals("0")) { //메뉴
					continue;
				}

				dao.searchMusic(music);
			}

			else if (key == 3) { // 음악 추가
				System.out.println();
				System.out.println("양식에 맞게 입력하시오 ex) AIRPLANE MODE,윤하,RescuE (0.이전메뉴)");
				System.out.print("입력: ");
				scanner.nextLine();
				String[] music = (scanner.nextLine()).split(",");

				if (music[0].equals("0")) {
					continue;
				}

				m.dao.addMusic(music[0], music[1], music[2]);
				System.out.println("저장되었습니다.");
			}

			else if (key == 4) { // 수정
				System.out.println();
				String[] value = new String[3];
				List<List<String>> tmp = dao.addPrintMusic();
				if (tmp.isEmpty()) {
					System.out.println("수정은 추가된 음악만 가능합니다.");
					System.out.println();
				} else {
					System.out.println("수정하고 싶은 곡 번호 (0.이전메뉴)");
					System.out.print("입력:");
					scanner.nextLine();
					value[0] = scanner.nextLine();

					if (value[0].equals("0")) { //메뉴
						continue;
					}

					System.out.println("수정하고 싶은 항목(1.곡, 2.가수(그룹), 3.앨범 중 택1)");
					System.out.print("입력: ");
					value[1] = scanner.nextLine();

					System.out.print("택스트 입력: ");
					value[2] = scanner.nextLine();

					dao.retouchMusic(tmp, value);
					System.out.println("수정되었습니다.");
				}
			}

			else if (key == 5) { // 삭제
				Boolean key5 = true;
				while (key5) {
					System.out.println();
					System.out.println("1.추가된 음악 삭제 2.MyPlaylist 삭제 3.MyPlaylist 초기화 4.메뉴");
					System.out.print("입력: ");
					int value = scanner.nextInt();
					scanner.nextLine();
					if (value == 1) { //추가된 음악 삭제
						while (true) {
							List<List<String>> tmp = dao.addPrintMusic();
							if (tmp.isEmpty()) {
								System.out.println();
								System.out.println("삭제는 추가된 음악만 가능합니다.");
								break;
							} else {
								System.out.println("삭제하고 싶은 번호 (0.이전메뉴)");
								System.out.print("번호 입력(여러개 가능) ex) 1,2,3,4 : ");
								String[] music = (scanner.nextLine()).split(",");
								if (music[0].equals("0")) {
									key5 = false;
									break;
								} else {
									for (String i : music)
										dao.deleteMusic(tmp, i);
								}
								System.out.println("삭제완료");
								key5 = false;
								break;
							}
						}
					}

					else if (value == 2) { //MyPlaylist 삭제
						List<List<String>> tmp = dao.printMyMusic();

						if (tmp.isEmpty()) {
							System.out.println();
							System.out.println("MyPlaylist가 비어있습니다.");
							break;
						} else {
							System.out.println();
							System.out.println("삭제하고 싶은 번호 (0.이전메뉴)");
							System.out.print("번호 입력(여러개 가능) ex) 1,2,3,4 : ");
							String[] music = (scanner.nextLine()).split(",");
							if (music[0].equals("0")) {
								continue;
							} else {
								for (String i : music)
									dao.deleteMyMusic(tmp, i);
							}
							System.out.println("삭제완료");
							key5 = false;
							break;
						}
					}

					else if (value == 3) { //MyPlaylist 초기화
						dao.mtInitialization();
						System.out.println("MyPlaylist가 초기화 되었습니다.");
						key5 = false;
						break;
					}

					else if (value == 4) { //메뉴
						key5 = false;
						break;
					} else {
						System.out.println("오!류");
					}
				}
			}

			else if (key == 6) { // MyPlaylist 추가
				Boolean key6 = true;
				while (key6) {
					System.out.println();
					System.out.println("MyPlaylist 추가 입니다.");
					System.out.println("1.직접 추가 2.검색후 추가 3.랜덤 추가 4.메뉴");
					System.out.print("입력: ");
					int value = scanner.nextInt();
					scanner.nextLine();
					if (value == 1) { //직접 추가
						while (true) {
							System.out.println();
							System.out.println("양식에 맞게 입력하시오 ex) AIRPLANE MODE,윤하,RescuE (0.이전메뉴)");
							System.out.print("입력: ");
							String[] music = (scanner.nextLine()).split(",");
							if (music[0].equals("0")) { //이전메뉴
								break;
							} else if (music.length == 3) {
								dao.addMyMusic(music[0], music[1], music[2]);
								System.out.println("저장되었습니다. ");
							} else {
								System.out.println("오!류");
							}
						}
					}

					else if (value == 2) {
						System.out.println();
						System.out.println("곡, 가수(그룹), 앨범 택1 검색 가능. (0.이전메뉴)");
						System.out.print("입력: ");
						String[] music = (scanner.nextLine()).split(",");

						if (music[0].equals("0")) {
							continue;
						}

						List<List<String>> tmp = dao.SearchMyMusic(music);
						int index = tmp.size();
						System.out.println();
						System.out.println("추가하고 싶은 번호 입력 (여러개 가능) ex) 1,2,3,4 (0.이전메뉴)");
						System.out.print("입력: ");
						music = (scanner.nextLine()).split(",");

						if (music[0].equals("0")) {
							continue;
						}

						for (String i : music) {
							tmp.add(tmp.get(Integer.parseInt(i) - 1));
						}
						tmp.subList(0, index).clear();
						dao.myListAddMusic(tmp);
						System.out.println("추가 완료");
						key6 = false;
					}

					else if (value == 3) {
						while (true) {
							List<List<String>> tmp = dao.randomMusic();
							System.out.println();
							System.out.println("1.MyList에 추가 2.한번더 3.취소");
							System.out.print("입력: ");
							int valueIn = scanner.nextInt();
							if (valueIn == 1) {
								dao.myListAddMusic(tmp);
								System.out.println("MyList에 추가 되었습니다.");
								System.out.println();
								break;
							} else if (valueIn == 2) {
								tmp = dao.randomMusic();
							} else if (valueIn == 3) {
								break;
							}
						}
					}

					else if (value == 4) {
						key6 = false;
					} else {
						System.out.println("오!류");
					}
				}
			}

			else if (key == 7) { // 종료
				System.out.println("프로그램을 종료합니다.");
				dao.disConnection();
				end = false;
			}

			else {
				System.out.println("오!류");
			}
		}
	}

}

//----------------------DataDAO---------------------------------
class DataDAO {

	private Connection conn;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs;
	private static DataDAO dao;
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "music";
	private static final String pwd = "1234";

	private DataDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disConnection() {
		try {
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DataDAO newInstance() {
		if (dao == null)
			dao = new DataDAO();

		return dao;

	}
	
	public boolean tableCheck() {
		String bool = null;
		try {
			getConnection();

			String sql = "select count(*) from USER_TABLES where table_name = 'MUSIC'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				bool = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return "1".equals(bool);
	}
	
	public void tableCreated() {
		try {
			getConnection();
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE MUSIC(no_music NUMBER(4),"
					+ "ranking VARCHAR2(100),"
					+ "name VARCHAR2(500),"
					+ "artist VARCHAR2(500),"
					+ "album VARCHAR2(200))";
			stmt.executeUpdate(sql);
			
			sql = "CREATE SEQUENCE no_music INCREMENT BY 1 START WITH 1 MAXVALUE 999 NOORDER";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public boolean myTableCheck() {
		String bool = null;
		try {
			getConnection();

			String sql = "select count(*) from USER_TABLES where table_name = 'MYMUSIC'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				bool = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return "1".equals(bool);
	}
	
	public void myTableCreated() {
		try {
			getConnection();
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE mymusic(no_mymusic NUMBER(4),"
					+ "ranking VARCHAR2(100),"
					+ "name VARCHAR2(500),"
					+ "artist VARCHAR2(500),"
					+ "album VARCHAR2(200))";
			stmt.executeUpdate(sql);
			
			sql = "CREATE SEQUENCE no_mymusic INCREMENT BY 1 START WITH 1 MAXVALUE 999 NOORDER";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void initialization() {
		try {
			getConnection();
			stmt = conn.createStatement();

			String sql = "DROP SEQUENCE no_music";
			stmt.executeUpdate(sql);

			sql = "CREATE SEQUENCE no_music INCREMENT BY 1 START WITH 1 MAXVALUE 999 NOORDER";
			stmt.executeUpdate(sql);

			sql = "DELETE FROM music";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void musicInsert(MusicVO se) {
		try {
			getConnection();
			String sql = "insert into MUSIC values(no_music.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, se.getRanking());
			pstmt.setString(2, se.getName());
			pstmt.setString(3, se.getArtist());
			pstmt.setString(4, se.getAlbum());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void getMusic() {
		try {
			getConnection();
			String sql = "SELECT * FROM MUSIC where not ranking ='추가' ORDER BY no_music";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 한줄씩 읽는다 (튜플)

				System.out.println("================================");
				System.out.println("순위:       " + rs.getString(2));
				System.out.println("곡:         " + rs.getString(3));
				System.out.println("가수(그룹): " + rs.getString(4));
				System.out.println("앨범:       " + rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");
	}
	
	public List<List<String>> addPrintMusic() {
		int count = 0;
		List<List<String>> addlist = new ArrayList<>();
		try {
			getConnection();
			String sql = "SELECT * FROM MUSIC WHERE ranking LIKE '%추가%'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 한줄씩 읽는다 (튜플)
				addlist.add(new ArrayList<String>(Arrays.asList(rs.getString(1), String.valueOf(++count),
						rs.getString(3), rs.getString(4), rs.getString(5))));
			}

			for (int i = 0; i < addlist.size(); i++) { // 한줄씩 읽는다 (튜플)
				System.out.println("================================");
				System.out.println("번호:       " + addlist.get(i).get(1));
				System.out.println("곡:         " + addlist.get(i).get(2));
				System.out.println("가수(그룹): " + addlist.get(i).get(3));
				System.out.println("앨범:       " + addlist.get(i).get(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");

		return addlist;
	}
	
	public List<List<String>> getMyMusic() {
		int count = 0;
		List<List<String>> list = new ArrayList<>();
		try {
			getConnection();
			String sql = "SELECT * FROM mymusic ORDER BY ranking";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 한줄씩 읽는다 (튜플)
				System.out.println("================================");
				System.out.println("순위:       " + rs.getString(2));
				System.out.println("곡:         " + rs.getString(3));
				System.out.println("가수(그룹): " + rs.getString(4));
				System.out.println("앨범:       " + rs.getString(5));

				list.add(new ArrayList<String>(Arrays.asList(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), String.valueOf(count))));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");

		return list;
	}
	
	public void searchMusic(String[] name) {
		List<List<String>> list = new ArrayList<>();
		try {
			getConnection();
			for (String i : name) {
				String sql = "SELECT * FROM MUSIC WHERE name LIKE '%" + i + "%' or artist LIKE '%" + i
						+ "%' or album LIKE '%" + i + "%'";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);

				while (rs.next()) { // 한줄씩 읽는다 (튜플)
					list.add(new ArrayList<String>(
							Arrays.asList(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5))));
				}

			}

			List<List<String>> newList = list.stream().distinct().collect(Collectors.toList());

			for (int i = 0; i < newList.size(); i++) { // 한줄씩 읽는다 (튜플)
				System.out.println("================================");
				System.out.println("순위:       " + newList.get(i).get(0));
				System.out.println("곡:         " + newList.get(i).get(1));
				System.out.println("가수(그룹): " + newList.get(i).get(2));
				System.out.println("앨범:       " + newList.get(i).get(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");
	}
	
	public void addMusic(String name, String artist, String album) {
		String sql = "insert into MUSIC values(no_music.nextval,?,?,?,?)";

		try {
			getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "추가");
			pstmt.setString(2, name);
			pstmt.setString(3, artist);
			pstmt.setString(4, album);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void retouchMusic(List<List<String>> list, String[] value) {
		String tmp, no = null;

		if (value[1].equals("1")) {
			tmp = "name";
		} else if (value[1].equals("2")) {
			tmp = "artist";
		} else if (value[1].equals("3")) {
			tmp = "album";
		} else {
			System.out.println("오류");
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get(1).equals(3)) {
				no = list.get(i).get(0);
			}
		}

		try {
			getConnection();
			String sql = "UPDATE MUSIC SET " + tmp + "='" + value[2] + "' WHERE no_music='" + no + "'";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}

	public void deleteMusic(List<List<String>> list, String value) {
		String no = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get(1).equals(value)) {
				no = list.get(i).get(0);
			}
		}

		try {
			getConnection();
			String sql = "delete from MUSIC WHERE no_music='" + no + "'";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}

	public List<List<String>> printMyMusic() {
		int count = 0;
		List<List<String>> list = new ArrayList<>();
		try {
			getConnection();
			String sql = "SELECT * FROM mymusic ORDER BY no_mymusic";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 한줄씩 읽는다 (튜플)
				System.out.println("================================");
				System.out.println("번호:       " + ++count);
				System.out.println("곡:         " + rs.getString(3));
				System.out.println("가수(그룹): " + rs.getString(4));
				System.out.println("앨범:       " + rs.getString(5));

				list.add(new ArrayList<String>(Arrays.asList(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), String.valueOf(count))));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");

		return list;
	}
	
	public void deleteMyMusic(List<List<String>> list, String value) {
		String no = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get(5).equals(value)) {
				no = list.get(i).get(0);
			}
		}

		try {
			getConnection();
			String sql = "delete from mymusic WHERE no_mymusic='" + no + "'";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void mtInitialization() {
		try {
			getConnection();
			stmt = conn.createStatement();

			String sql = "DROP SEQUENCE no_mymusic";
			stmt.executeUpdate(sql);

			sql = "CREATE SEQUENCE no_mymusic INCREMENT BY 1 START WITH 1 MAXVALUE 999 NOORDER";
			stmt.executeUpdate(sql);

			sql = "DELETE FROM mymusic";
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public void addMyMusic(String name, String artist, String album) {
		String sql = "insert into mymusic values(no_mymusic.nextval,?,?,?,?)";

		try {
			getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "추가");
			pstmt.setString(2, name);
			pstmt.setString(3, artist);
			pstmt.setString(4, album);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public List<List<String>> SearchMyMusic(String[] name) {
		int count = 0;
		List<List<String>> list = new ArrayList<>();

		try {
			getConnection();
			for (String i : name) {
				String sql = "SELECT * FROM MUSIC WHERE name LIKE '%" + i + "%' or artist LIKE '%" + i
						+ "%' or album LIKE '%" + i + "%'";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);

				while (rs.next()) { // 한줄씩 읽는다 (튜플)
					list.add(new ArrayList<String>(Arrays.asList(String.valueOf(++count), rs.getString(2),
							rs.getString(3), rs.getString(4), rs.getString(5))));
				}
			}

			list = list.stream().distinct().collect(Collectors.toList()); // 중복제거

			for (int i = 0; i < list.size(); i++) { // 한줄씩 읽는다 (튜플)
				System.out.println("================================");
				System.out.println("번호:       " + list.get(i).get(0));
				System.out.println("곡:         " + list.get(i).get(2));
				System.out.println("가수(그룹): " + list.get(i).get(3));
				System.out.println("앨범:       " + list.get(i).get(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");
		return list;
	}
	
	public void myListAddMusic(List<List<String>> list) {
		String sql = "insert into mymusic values(no_mymusic.nextval,?,?,?,?)";
		getConnection();
		try {
			for (int i = 0; i < list.size(); i++) { // 한줄씩 읽는다 (튜플)
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, list.get(i).get(1));
				pstmt.setString(2, list.get(i).get(2));
				pstmt.setString(3, list.get(i).get(3));
				pstmt.setString(4, list.get(i).get(4));
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
	public List<List<String>> randomMusic() {
		List<List<String>> addlist = new ArrayList<>();
		try {
			getConnection();
			String sql = "select * from (select * from music order by dbms_random.value) where rownum <= 30 ORDER BY no_music";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 한줄씩 읽는다 (튜플)
				addlist.add(new ArrayList<String>(Arrays.asList(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5))));
			}

			for (int i = 0; i < addlist.size(); i++) { // 한줄씩 읽는다 (튜플)

				System.out.println("================================");
				// System.out.println("번호: " + addlist.get(i).get(1));
				System.out.println("순위:       " + addlist.get(i).get(1));
				System.out.println("곡:         " + addlist.get(i).get(2));
				System.out.println("가수(그룹): " + addlist.get(i).get(3));
				System.out.println("앨범:       " + addlist.get(i).get(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnection();
		}
		System.out.println("================================");
		return addlist;
	}

}



//------------------MusicVO-------------------------
class MusicVO {
	private String ranking;
	private String name;
	private String artist;
	private String album;

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

}

//----------------------------------Bugs----------------------------------------
class Bugs {
	
	DataDAO dao = DataDAO.newInstance();
	List<MusicVO> list = new ArrayList<>();

	public void crawling() {

		try {
			Document doc = Jsoup.connect("https://music.bugs.co.kr/chart/track/realtime/total").get();
			Elements ranking = doc.select("div.ranking strong"); // 랭킹
			Elements name = doc.select("p.title"); // 랭킹
			Elements artist = doc.select("p.artist"); // 랭킹
			Elements album = doc.select("a.album"); // 랭킹

			for (int i = 0; i <= 100; i++) {
				try {       
					MusicVO mvo = new MusicVO();

					mvo.setRanking(ranking.get(i).text());
					mvo.setName(name.get(i).text());
					mvo.setArtist(artist.get(i).text());
					mvo.setAlbum(album.get(i + 1).text());

					list.add(mvo);

					dao.musicInsert(mvo);
				} catch (Exception ex) {
				}
			}

		} catch (Exception ex) {
		}
	}
	

	public void musicShow() {
		System.out.println("정보 출력-----------------");
		for (MusicVO mvo : list) {
			System.out.println("랭킹 : " + mvo.getRanking());
			System.out.println("곡 : " + mvo.getName());
			System.out.println("가수 : " + mvo.getArtist());
			System.out.println("앨범 : " + mvo.getAlbum());
			System.out.println("-------------------------------");
		}

	}

}

