package jacoco;

import org.junit.jupiter.api.Test;

class JacocoExceptionTest {

	@Test
	void autoClosableInstanceEntityTest() throws Exception {
		AutoClosableFactory autoClosableFactory = new AutoClosableFactory(AutoClosableBehaviourEnum.INSTANCE);
		var jacocoException = new JacocoBadCoverageExample();
		jacocoException.handleConnection(autoClosableFactory);

	}

	@Test
	void autoClosableNullTest() throws Exception {
		AutoClosableFactory autoClosableFactory = new AutoClosableFactory(AutoClosableBehaviourEnum.NULL);
		var jacocoException = new JacocoBadCoverageExample();
		jacocoException.handleConnection(autoClosableFactory);
	}

	@Test
	void autoClosableExceptionTest() throws Exception {
		AutoClosableFactory autoClosableFactory = new AutoClosableFactory(AutoClosableBehaviourEnum.EXCEPTION);
		var jacocoException = new JacocoBadCoverageExample();
		jacocoException.handleConnection(autoClosableFactory);
	}
}
