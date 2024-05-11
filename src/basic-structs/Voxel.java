public class Voxel {
	public final int TOP = 0, NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4, BOTTOM = 5;

	private final Bitmap[] sides;

	/** return null if invalid */
	public static Voxel make(Bitmap[] sides) {
		return sides.length == 6
				? new Voxel(sides)
				: null;
	}

	private Voxel(Bitmap[] sides) {
		this.sides = sides;
	}
}
