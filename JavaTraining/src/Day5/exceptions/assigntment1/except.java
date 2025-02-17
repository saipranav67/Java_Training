package Day5.exceptions.assigntment1;

public class except {
	static class sizeOverFlow extends Exception{
		public sizeOverFlow() {
			super("Size over flow");
		}
		
	}
	static class underFlow extends Exception{
		public underFlow() {
			super("under flow");
		}
	}
	static class incorrectInfo extends Exception{
		public incorrectInfo(String s) {
			super(s);
		}
	}

}
