package proxy;

public class Imple_MyBusinessObject implements Interface_MyBusinessObject{

	@Override
	public String doExecute(String in) {
		System.out.println("Here in MyBusinessObject doExecute: input :" + in);
        return in;
	}

}
