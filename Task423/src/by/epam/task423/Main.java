package by.epam.task423;

/*
 *  3. Создать объект класса Государство, используя классы Область, Район, Город.
 *  Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 *
 */
public class Main {

    public static void main(String[] args) {

        // города Смолевичского района
        Town[] townsSmolDistr = new Town[2];
        townsSmolDistr[0] = new Town("Smolevichi", 16784);
        townsSmolDistr[1] = new Town("Zhodino", 64559);

        // города Борисовского района
        Town[] townsBorisovDistr = new Town[2];
        townsBorisovDistr[0] = new Town("Borisov", 143051);
        townsBorisovDistr[1] = new Town("Loshnitsa", 6628);

        // города Минского района
        Town[] townsMinskDistr = new Town[2];
        townsMinskDistr[0] = new Town("Minsk", 1992685);
        townsMinskDistr[1] = new Town("Zaslavl", 15661);

        // города Полоцкого района
        Town[] townsPolotskDistr = new Town[2];
        townsPolotskDistr[0] = new Town("Polotsk", 84597);
        townsPolotskDistr[1] = new Town("Novopolotsk", 101596);

        // города Витебского района
        Town[] townsVitebskDistr = new Town[2];
        townsVitebskDistr[0] = new Town("Vitebsk", 378459);
        townsVitebskDistr[1] = new Town("Vorony", 679);

        District[] districtMinsk = new District[3];
        districtMinsk[0] = new District("Smolevichi district", townsSmolDistr,
                "Smolevichi", 1394, 110784);
        districtMinsk[1] = new District("Borisov district", townsBorisovDistr,
                "Borisov" , 2987, 180639);
        districtMinsk[2] = new District("Minsk district", townsMinskDistr,
                "Minsk", 2251, 2208089);

        District[] districtVitebsk = new District[2];
        districtVitebsk[0] = new District("Polotsk district", townsPolotskDistr,
                "Polotsk", 3178, 209076);
        districtVitebsk[1] = new District("Vitebsk district", townsVitebskDistr,
                "Vitebsk", 2737, 415510);

        Region[] regions = new Region[2];
        regions[0] = new Region("Minsk region", districtMinsk, "Minsk");
        regions[1] = new Region("Vitebsk region", districtVitebsk, "Vitebsk");

        State republic = new State("Belarus", regions, "Minsk");

        StateShow stateShow = new StateShow(republic);

        // вывод на печать столицы государства
        stateShow.showCapital();

        // вывод на печать количества областей
        stateShow.showNumberOfRegion();

        // вывод на печать площади государства
        stateShow.showStateArea();

        // вывод на печать столиц областей
        stateShow.showCapitalsOfRegions();

    }
}
