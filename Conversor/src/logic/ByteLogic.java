package logic;

public class ByteLogic {
	private Integer kiloByte = 1024;
	private Integer megaByte = 1048576;
	private Integer gigaByte = 1073741824;
	private Long teraByte = 1099511627776L;
	private static ByteLogic instance;
	
	private ByteLogic() {}
	
	public static ByteLogic getInstance() {
		if(instance == null) {
			instance = new ByteLogic();
		}
		return instance;
	}
	
}
