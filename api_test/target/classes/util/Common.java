package util;

public class Common {
	public static final String VIEW_PATH = "/WEB-INF/views/";
	
	public static class Users{
		public static String userPath(String path) {
			return VIEW_PATH + "users/" + path + ".jsp";
		}
	}
	
	public static class Movies{
		public static String moviePath(String path) {
			return VIEW_PATH + "movies/" + path + ".jsp";
		}
	}
	
	public static class MainPath{
		public static String mainPath(String path) {
			return VIEW_PATH + path + ".jsp";
		}
	}
}
