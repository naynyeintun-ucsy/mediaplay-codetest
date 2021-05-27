public class PlayerFactory {
	
	public Player  getInstance(String extension) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		Class cls = null ;
		Player player = new Player() ;
		
		switch (extension) {
		case ".mp3" : cls= Class.forName("Mp3Patch");
		      
				break;
		case ".mp4" : cls = Class.forName("Mp4Patch");
			break;
			
		case ".png" : cls = Class.forName("PngPatch");
				break;
	
			
		}
		 player=(Player)cls.newInstance();
		return player;
		
	}

}
