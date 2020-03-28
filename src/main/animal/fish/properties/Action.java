package main.animal.fish.properties;

public enum Action {
	JOKE("Jokes"),
	EAT_OTHER("Eat other fish"),
	DANCE("Dance");

	private String action;

	Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
