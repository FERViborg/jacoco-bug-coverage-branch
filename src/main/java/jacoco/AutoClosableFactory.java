package jacoco;

public class AutoClosableFactory {

	private AutoClosableBehaviourEnum autoClosableBehaviour;

	public AutoClosableFactory(AutoClosableBehaviourEnum autoClosableBehaviour) {
		this.autoClosableBehaviour = autoClosableBehaviour;
	}
	
	public AutoClosableImpl create() throws RuntimeException {
		if(autoClosableBehaviour == AutoClosableBehaviourEnum.INSTANCE) {
			return new AutoClosableImpl();
		}

		if(autoClosableBehaviour == AutoClosableBehaviourEnum.EXCEPTION) {
			throw new RuntimeException();
		}

		return null;
	}
}
