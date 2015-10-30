package exam3.ioc_container;

public class Bean_DI_Object {
	private Bean_Interface imp;

	
	public Bean_DI_Object() {}
	public Bean_DI_Object(Bean_Interface imp) {
		this.imp = imp;
	}

	public Bean_Interface getImp() {
		return imp;
	}

	public void setImp(Bean_Interface imp) {
		this.imp = imp;
	}
	
}
