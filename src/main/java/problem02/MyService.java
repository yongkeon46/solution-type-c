package problem02;

public class MyService extends BaseService {

	@Override
	public void service(String state) {
		String result = "";
		if(state.equals("오후")) {
			result = afternoon();
		}
		if(state.equals("낮")) {
			result = day();
		}
		if(state.equals("밤")) {
			result = night();
		}
			
		System.out.println(result);
		
	}

	public String afternoon() {
		return "오후서비스시작";
	}

	@Override
	public String day() {
		// TODO Auto-generated method stub
		return super.day() + "서비스시작";
	}

	@Override
	public String night() {
		// TODO Auto-generated method stub
		return super.night() + "서비스시작";
	}
	


	
}
