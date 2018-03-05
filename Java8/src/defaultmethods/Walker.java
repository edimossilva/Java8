package defaultmethods;

public interface Walker {
	
	void walk();
	
	default void saySomething() {
		System.out.println( "I know how to walk (implemented in Interface)" );
	};
}
