package castingTask1;

public class CastingTask {
	public static void checkVideo(Video video) {
		if (video instanceof Drama) {
			Drama drama = (Drama) video;
			drama.goods();
			drama.playVideo();
		} else if (video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.subtitle();
		} else if (video instanceof Film) {
			Film film = (Film) video;
			film.asset_4D();
		}
	}

	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		castingTask.checkVideo(new Drama());
	}
}
