public class TreasureTile extends Tile {
    public TreasureTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void interact(Player player) {
        player.addRunes(ThreadLocalRandom.current().nextInt(50, 151) * player.getCurrentArea().getAreaIndex());
        System.out.println("You found some runes!");
        player.setTileDisabled(true);
    }
}
