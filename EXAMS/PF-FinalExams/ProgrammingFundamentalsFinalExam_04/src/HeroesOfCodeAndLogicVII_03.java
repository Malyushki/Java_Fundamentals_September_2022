import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Hero>heroesList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] heroesInput = scanner.nextLine().split(" ");
            heroesList.add(new Hero(heroesInput[0],Integer.parseInt(heroesInput[1]),Integer.parseInt(heroesInput[2])));
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandType = command.split("\\s[-]\\s");
            String heroName = commandType[1];
            switch (commandType[0]){
                case "CastSpell":

                    int neededMP = Integer.parseInt(commandType[2]);
                    String spellName = commandType[3];
                    for (Hero e:heroesList) {
                        if (e.getHeroName().equals(heroName)){
                            e.castSpell(neededMP,spellName);
                        }
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandType[2]);
                    String attacker = commandType[3];

                    for (Hero e:heroesList) {
                        if (e.getHeroName().equals(heroName)){
                            e.takeDamage(damage,attacker);
                        }
                    }
                    break;
                case "Recharge":
                    int rechargeMP = Integer.parseInt(commandType[2]);
                    for (Hero e:heroesList) {
                        if (e.getHeroName().equals(heroName)){
                            e.rechargeMP(rechargeMP);
                        }
                    }
                    break;
                case "Heal":
                    int healHP = Integer.parseInt(commandType[2]);
                    for (Hero e:heroesList) {
                        if (e.getHeroName().equals(heroName)) {
                            e.healHP(healHP);
                        }
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        for (Hero e:heroesList) {
            if (!e.getHeroName().equals("dead")){
                System.out.println(e.getHeroName());
                System.out.println(" HP: "+e.getHitPoints());
                System.out.println(" MP: "+e.getManaPoints());
            }
        }
    }
}
class  Hero{
    private String heroName;
    private int hitPoints;
    private int manaPoints;

    public Hero(String heroName, int hitPoints, int manaPoints) {
        this.heroName = heroName;
        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
    }



    public String getHeroName() {
        return heroName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void castSpell(int manaForCast, String spellName){
        if (manaForCast<=this.manaPoints){
            this.manaPoints-=manaForCast;
            System.out.printf("%s has successfully cast %s and now has %d MP!%n",this.heroName,spellName,this.manaPoints);

        }else {
            System.out.printf("%s does not have enough MP to cast %s!%n",this.heroName,spellName);
        }
    }
    public void takeDamage(int damage, String attacker){
        if (this.hitPoints>damage){
          this.hitPoints-=damage;
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName,damage,attacker,hitPoints);
        }else {
            System.out.printf("%s has been killed by %s!%n",heroName,attacker);
            this.heroName = "dead";
        }
    }
    public void rechargeMP(int rechargeMP){
        if (this.manaPoints+rechargeMP>200){
            System.out.printf("%s recharged for %d MP!%n",heroName,200-manaPoints);
            this.manaPoints = 200;
        }else {
            System.out.printf("%s recharged for %d MP!%n",heroName,rechargeMP);
            this.manaPoints+=rechargeMP;
        }
    }
    public void healHP(int rechargeHP){
        if (this.hitPoints+rechargeHP>100){
            System.out.printf("%s healed for %d HP!%n",heroName,100-hitPoints);
            this.hitPoints = 100;
        }else {
            System.out.printf("%s healed for %d HP!%n",heroName,rechargeHP);
            this.hitPoints+=rechargeHP;
        }


    }

}
