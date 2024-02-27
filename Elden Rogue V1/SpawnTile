public class SpawnTile extends Tile {
    private final int enemyType;

    public SpawnTile(int x, int y, int enemyType) {
        super(x, y);
        this.enemyType = enemyType;
    }

    @Override
    public void interact(Player player) {
        if (ThreadLocalRandom.current().nextInt(0, 100) < 75) {
            Enemy enemy = new Enemy(enemyType, player.getCurrentArea().getAreaIndex());
            player.startBattle(enemy);
        } else {
            player.addRunes(ThreadLocalRandom.current().nextInt(50, 151) * player.getCurrentArea().getAreaIndex());
            System.out.println("You found some runes!");
        }
        player.setTileDisabled(true);
    }
}
