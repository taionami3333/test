public class SmartPhone extends Phone implements Mp3Player, NewFunction {
	public void play(){
		System.out.println("再生");
	}
	public void stop(){
		System.out.println("停止");
	}
	public void back(){
		System.out.println("戻る");
	}
	public void next(){
		System.out.println("次へ");
	}
}