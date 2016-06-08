package fr.swisslife.front.menu.enumeration;

import java.util.ArrayList;
import java.util.List;

class Ow {

    static private Heroes heroes;
    static int[]          communStack;
    static int            communItemsNotOwn;
    static int[]          rareStack;
    static int            rareItemsNotOwn;
    static int[]          epicStack;
    static int            epicItemsNotOwn;
    static int[]          legendaryStack;
    static int            legendaryItemsNotOwn;
    static int            gold        = 0;
    static int            boxesNeeded = 0;
    static int            ItemsNotOwn;
    static int            indexRandom;

    public static void main(String[] args) {

      
    }

    private static void spendGoldForItem() {
       }
}

enum Rarities {
    COMMUN("commun", "white"), RARE("rare", "blue"), EPIC("epic", "purple"), LEGENDARY(
            "legendary", "orange");

    private int    index;
    private String rarity = "";
    private String color  = "";

    Rarities(String rarity, String color) {
        this.rarity = rarity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return rarity;
    }
}

class HeroeItems {

    protected CommunItems    commun;
    protected RareItems      rare;
    protected EpicItems      epic;
    protected LegendaryItems legendary;

    HeroeItems() {
    }

    HeroeItems(int communNb, int rareNb, int epicNb, int legendaryNb) {
        commun = new CommunItems(communNb);
        rare = new RareItems(rareNb);
        epic = new EpicItems(epicNb);
        legendary = new LegendaryItems(epicNb);

    }

    /**
     * @return the commun
     */
    public CommunItems getCommun() {
        return commun;
    }

    /**
     * @return the rare
     */
    public RareItems getRare() {
        return rare;
    }

    /**
     * @return the epic
     */
    public EpicItems getEpic() {
        return epic;
    }

    /**
     * @return the legendary
     */
    public LegendaryItems getLegendary() {
        return legendary;
    }

}

class Bastion extends HeroeItems {

    Bastion() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class DVa extends HeroeItems {

    DVa() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Genji extends HeroeItems {

    Genji() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Hanzo extends HeroeItems {

    Hanzo() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Junkrat extends HeroeItems {

    Junkrat() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Lucio extends HeroeItems {

    Lucio() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class McCree extends HeroeItems {

    McCree() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Mei extends HeroeItems {

    Mei() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Mercy extends HeroeItems {

    Mercy() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Pharah extends HeroeItems {

    Pharah() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Reaper extends HeroeItems {

    Reaper() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Reinhardt extends HeroeItems {

    Reinhardt() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Roadhog extends HeroeItems {

    Roadhog() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Soldier76 extends HeroeItems {

    Soldier76() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Symmetra extends HeroeItems {

    Symmetra() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Torbjorn extends HeroeItems {

    Torbjorn() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Tracer extends HeroeItems {

    Tracer() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Widowmaker extends HeroeItems {

    Widowmaker() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Winston extends HeroeItems {

    Winston() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Zarya extends HeroeItems {

    Zarya() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class Zenyatta extends HeroeItems {

    Zenyatta() {
        super.commun = new CommunItems(37);
        super.rare = new RareItems(7);
        super.epic = new EpicItems(8);
        super.legendary = new LegendaryItems(4);
    }
}

class CommunItems extends Items {

    CommunItems(int numberItems) {
        super(Rarities.COMMUN.toString(), 75, numberItems, 58.66);
    }
}

class RareItems extends Items {

    RareItems(int numberItems) {
        super(Rarities.RARE.toString(), 75, numberItems, 31.69);
    }
}

class EpicItems extends Items {

    EpicItems(int numberItems) {
        super(Rarities.EPIC.toString(), 250, numberItems, 7.22);
    }
}

class LegendaryItems extends Items {

    LegendaryItems(int numberItems) {
        super(Rarities.LEGENDARY.toString(), 1000, numberItems, 2.43);
    }
}

class Items {

    private String type;
    private int    price;
    private int    number;
    private double pourcentage;

    Items(String type, int price, int number, double pourcentage) {
        this.type = type;
        this.price = price;
        this.number = number;
        this.pourcentage = pourcentage;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number
     *            the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the pourcentage
     */
    public double getPourcentage() {
        return pourcentage;
    }

    /**
     * @param pourcentage
     *            the pourcentage to set
     */
    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

}

class Heroes {

    final private List<HeroeItems> heroes       = new ArrayList<HeroeItems>();
    private CommunItems            allCommun    = new CommunItems(0);
    private RareItems              allRare      = new RareItems(0);
    private EpicItems              allEpic      = new EpicItems(0);
    private LegendaryItems         allLegendary = new LegendaryItems(0);
    private int                    total        = 0;

    Heroes() {
        heroes.add(new Bastion());
        heroes.add(new DVa());
        heroes.add(new Genji());
        heroes.add(new Hanzo());
        heroes.add(new Junkrat());
        heroes.add(new Lucio());
        heroes.add(new McCree());
        heroes.add(new Mei());
        heroes.add(new Mercy());
        heroes.add(new Pharah());
        heroes.add(new Reaper());
        heroes.add(new Reinhardt());
        heroes.add(new Roadhog());
        heroes.add(new Soldier76());
        heroes.add(new Symmetra());
        heroes.add(new Torbjorn());
        heroes.add(new Tracer());
        heroes.add(new Widowmaker());
        heroes.add(new Winston());
        heroes.add(new Zarya());
        heroes.add(new Zenyatta());

        getAllItems();
    }

    private void getAllItems() {
        for (HeroeItems heroe : heroes) {
            allCommun.setNumber(allCommun.getNumber()
                    + totalItems(heroe.getCommun().getNumber()));
            allRare.setNumber(allRare.getNumber()
                    + totalItems(heroe.getRare().getNumber()));
            allEpic.setNumber(allEpic.getNumber()
                    + totalItems(heroe.getEpic().getNumber()));
            allLegendary.setNumber(allLegendary.getNumber()
                    + totalItems(heroe.getLegendary().getNumber()));
        }
        System.out.println(toString());
    }

    /**
     * @return the allCommun
     */
    public CommunItems getAllCommun() {
        return allCommun;
    }

    /**
     * @param allCommun
     *            the allCommun to set
     */
    public void setAllCommun(CommunItems allCommun) {
        this.allCommun = allCommun;
    }

    /**
     * @return the allRare
     */
    public RareItems getAllRare() {
        return allRare;
    }

    /**
     * @param allRare
     *            the allRare to set
     */
    public void setAllRare(RareItems allRare) {
        this.allRare = allRare;
    }

    /**
     * @return the allEpic
     */
    public EpicItems getAllEpic() {
        return allEpic;
    }

    /**
     * @param allEpic
     *            the allEpic to set
     */
    public void setAllEpic(EpicItems allEpic) {
        this.allEpic = allEpic;
    }

    /**
     * @return the allLegendary
     */
    public LegendaryItems getAllLegendary() {
        return allLegendary;
    }

    /**
     * @param allLegendary
     *            the allLegendary to set
     */
    public void setAllLegendary(LegendaryItems allLegendary) {
        this.allLegendary = allLegendary;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total
     *            the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    private int totalItems(int number) {
        this.total += number;
        return number;
    }

    @Override
    public String toString() {
        return heroes.size() + " Heroes [allCommun=" + allCommun.getNumber()
                + ", allRare=" + allRare.getNumber() + ", allEpic="
                + allEpic.getNumber() + ", allLegendary="
                + allLegendary.getNumber() + ", Total=" + total + "]";
    }

}
