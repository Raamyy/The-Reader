import java.util.ArrayList;

public class Category {
	String name;
	ArrayList<User> followers;

	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addFollower(User user) {
		if (followers.contains(user))
			return false;
		followers.add(user);
		return true;
	}

	public boolean removeFollower(User user)
	{
		return followers.remove(user);
	}

	public void notifyFollowers(Notification notification) {
		for(User user : followers)
			user.notify(notification.clone());
	}
}