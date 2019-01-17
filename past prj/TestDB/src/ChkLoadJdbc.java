
public class ChkLoadJdbc {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		String msg = "";
		try{
			Class.forName("com.myslq,jdbc.Driver").newInstance();
			msg ="ドライバのロードに成功しました";
		}catch(ClassNotFoundException e){
			msg = "ドライバのロードに失敗しました";
		}
		System.out.println(msg);
	}
}
