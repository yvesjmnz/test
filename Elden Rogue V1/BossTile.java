public class BossTile extends Tile {
    public BossTile(int x, int y) {
        super(x, y);
    }

    @Override
    public void interact(Player player) {
        if (!player.getTileDisabled()) {
            player.startBattle(player.getCurrentArea().getBoss());
            player.setTileDisabled(true);
        }
    }
}
