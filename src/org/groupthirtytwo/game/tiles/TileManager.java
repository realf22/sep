package org.groupthirtytwo.game.tiles;

import org.groupthirtytwo.game.tiles.configurations.*;

import java.util.HashMap;
import java.util.Map;

public class TileManager {
    Map<Integer, Tile> tileMap;

    public TileManager() {
        // THE BOARD
        this.tileMap = new HashMap<>(){{
            put(0, new Go(0));
            put(1, new TheOldCreek(1));
            put(2, new PotLuckStation(2));
            put(3, new GangstersParadise(3));
            put(4, new IncomeTax(4));
            put(5, new BrightonStation(5));
            put(6, new TheAngelsDelight(6));
            put(7, new OpportunityKnocksStation(7));
            put(8, new PotterAvenue(8));
            put(9, new GrangerDrive(9));
            put(10, new Jail(10));
            put(11, new SkywalkerDrive(11));
            put(12, new TeslaPowerCo(12));
            put(13, new WookieHole(13));
            put(14, new ReyLane(14));
            put(15, new HoveStation(15));
            put(16, new BishopDrive(16));
            put(17, new PotLuckStation(17));
            put(18, new DunhamStreet(18));
            put(19, new FreeParking(12));
            put(20, new YueFeiSquare(20));
            put(21, new OpportunityKnocksStation(21));
            put(22, new MulanRouge(22));
            put(23, new HanXinGardens(23));
            put(24, new FalmerStation(24));
            put(25, new ShatnerClose(25));
            put(26, new PicardAvenue(26));
            put(27, new EdisonWater(27));
            put(28, new CrusherCreek(28));
            put(29, new PotterAvenue(29));
            put(30, new GoToJail(30));
            put(31, new SiratMews(31));
            put(32, new GhengisCrescent(32));
            put(33, new PotLuckStation(33));
            put(34, new IbisClose(34));
            put(35, new PortsladeStation(35));
            put(36, new OpportunityKnocksStation(36));
            put(37, new JamesWebbWay(37));
            put(38, new SuperTax(38));
            put(39, new TuringHeights(39));
        }};
    }

    public int getTileCount() {
        return tileMap.size();
    }

    public Tile getTile(String name) {
        for (Tile tile : this.getTileMap().values()) {
            if (tile.getName().equals(name)) {
                return tile;
            }
        }
        return null;
    }

    public Tile getTile(int position) {
        for (Tile tile : this.getTileMap().values()) {
            if (tile.getPosition() == position) {
                return tile;
            }
        }
        return null;
    }

    public Map<Integer, Tile> getTileMap() {
        return tileMap;
    }
}
