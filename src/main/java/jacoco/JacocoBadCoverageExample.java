package jacoco;

public class JacocoBadCoverageExample {

	public Pojo handleConnection(AutoClosableFactory autoClosableFactory) {

		var pojo = new Pojo();

		try (var autoClosable = autoClosableFactory.create()) {
			if(null == autoClosable) {
				return pojo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pojo;
	}
}
