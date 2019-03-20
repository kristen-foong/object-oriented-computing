
public class Door implements Lockable{
	private boolean isOpen;
	private int key;
	private boolean locked;
	
	public Door() {
		isOpen = false;
		locked = false;
		key = 0;
	}
	
	public void open() {
		if(!this.isLocked()) {
			isOpen = true;
		}
	}
	
	public void close() {
		isOpen = false;
	}
	
	public boolean getState() {
		return isOpen;
	}
	
	public String toString() {
		if(isOpen) {
			return "The door is open";
		}else {
			return "The door is closed";
		}
	}
	
	/**
	 * Interface methods
	 */
	public void setKey(int key) {
		if(!locked) {
			this.key = key;
		}
	}
	
	@Override
	public void lock(int key) {
		if(this.key == key) {
			locked = true;
		}
	}

	@Override
	public void unlock(int key) {
		if(this.key == key) {
			locked = false;
		}
	}

	@Override
	public boolean isLocked() {
		return locked;
	}
}
