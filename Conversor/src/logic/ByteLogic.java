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
	
	public Double byteAOtraUnidad (String tipo, Double valor) {
		switch(tipo) {
			case "Byte": return valor;
			
			case "Kilobyte KB": return valor / kiloByte;
			
			case "Megabyte MB": return valor / megaByte;
			
			case "Gigabyte GB": return valor / gigaByte;
			
			case "Terabyte TB": return valor / teraByte;
			
			default: return null;
		}
	}
	
	public Double kilobyteAOtraUnidad (String tipo, Double valor) {
		switch(tipo) {
			case "Byte": return valor * kiloByte;
			
			case "Kilobyte KB": return valor;
			
			case "Megabyte MB": return (valor * kiloByte) / megaByte;
			
			case "Gigabyte GB": return (valor * kiloByte) / gigaByte;
			
			case "Terabyte TB": return (valor * kiloByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double megabyteAOtraUnidad (String tipo, Double valor) {
		switch(tipo) {
			case "Byte": return valor * megaByte;
			
			case "Kilobyte KB": return (valor * megaByte) / kiloByte;
			
			case "Megabyte MB": return valor;
			
			case "Gigabyte GB": return (valor * megaByte) / gigaByte;
			
			case "Terabyte TB": return (valor * megaByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double gigabyteAOtraUnidad (String tipo, Double valor) {
		switch(tipo) {
			case "Byte": return valor * gigaByte;
			
			case "Kilobyte KB": return (valor * gigaByte) / kiloByte;
			
			case "Megabyte MB": return (valor * gigaByte) / megaByte;
			
			case "Gigabyte GB": return valor;
			
			case "Terabyte TB": return (valor * gigaByte) / teraByte;
			
			default: return null;
		}
	}
	
	public Double terabyteAOtraUnidad (String tipo, Double valor) {
		switch(tipo) {
			case "Byte": return valor * teraByte;
			
			case "Kilobyte KB": return (valor * teraByte) / kiloByte;
			
			case "Megabyte MB": return (valor * teraByte) / megaByte;
			
			case "Gigabyte GB": return (valor * teraByte) / gigaByte;
			
			case "Terabyte TB": return valor;
			
			default: return null;
		}
	}
}
