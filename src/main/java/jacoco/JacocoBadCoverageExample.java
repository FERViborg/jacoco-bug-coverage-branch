package jacoco;

public class JacocoBadCoverageExample {

	public String handleConnection(AutoClosableFactory autoClosableFactory) {

		try (var autoClosable = autoClosableFactory.create()) {
			if(null == autoClosable) {
				return "";
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}
}
