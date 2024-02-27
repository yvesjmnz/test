public class DoorTile extends Tile {
    private final int destinationFloor;

    public DoorTile(int x, int y, int destinationFloor) {
        super(x, y);
        this.destinationFloor = destinationFloor;
    }

    @Override
    public void interact(Player player) {
        player.setCurrentFloor(destinationFloor);
        player.setCurrentTile(player.getCurrentArea().getFloors().get(player.getCurrentFloor()).getTile(1, 1));
    }
}
