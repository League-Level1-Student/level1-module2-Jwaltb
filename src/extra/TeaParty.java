package extra;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted){
		if(isWoman == true && isKnighted == false) {
			return "Hello Ms. " + name;
		}
		else if(isWoman == false && isKnighted == false) {
			return "Hello Mr. " + name;
		}
		else if(isWoman == false && isKnighted == true) {
			return "Hello Sir " + name; 
		}
		else {
			return "Hello Lady " + name;
		}
    }
}
