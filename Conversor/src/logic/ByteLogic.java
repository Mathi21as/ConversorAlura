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
	
	public Double byteToOtherUnit (String type, Double value) {
		switch(type) {
			case "Byte": return value;
			
			case "Kilobyte KB": return value / kiloByte;
			
			case "Megabyte MB": return value / megaByte;
			
			case "Gigabyte GB": return value / gigaByte;
			
			case "Terabyte TB": return value / teraByte;
			
			default: return null;
		}
	}
	
	public Double kilobyteToOtherUnit (String type, Double value) {
		switch(type) {
			case "Byte": return value * kiloByte;
			
			case "Kilobyte KB": return value;
			
			case "Megabyte MB": return (value * kiloByte) / megaByte;
			
			case "Gigabyte GB": return (value * kiloByte) / gigaByte;
			
			case "Terabyte TB": return (value * kiloByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double megabyteToOtherUnit (String type, Double value) {
		switch(type) {
			case "Byte": return value * megaByte;
			
			case "Kilobyte KB": return (value * megaByte) / kiloByte;
			
			case "Megabyte MB": return value;
			
			case "Gigabyte GB": return (value * megaByte) / gigaByte;
			
			case "Terabyte TB": return (value * megaByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double gigabyteToOtherUnit (String type, Double value) {
		switch(type) {
			case "Byte": return value * gigaByte;
			
			case "Kilobyte KB": return (value * gigaByte) / kiloByte;
			
			case "Megabyte MB": return (value * gigaByte) / megaByte;
			
			case "Gigabyte GB": return value;
			
			case "Terabyte TB": return (value * gigaByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double terabyteToOtherUnit (String type, Double value) {
		switch(type) {
			case "Byte": return value * teraByte;
			
			case "Kilobyte KB": return (value * teraByte) / kiloByte;
			
			case "Megabyte MB": return (value * teraByte) / megaByte;
			
			case "Gigabyte GB": return (value * teraByte) / gigaByte;
			
			case "Terabyte TB": return value;
			
			default: return null;
		}
	}
}
