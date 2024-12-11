import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        nameGenerator();
        }

        public static void nameGenerator(){
          //  int i=0;


            String[] prefix = {"Alex","A", "Ach", "Adon", "Aeg", "Aeth", "Aphro",
                    "Aner", "Agro", "Ala", "Alb", "Alci", "Amor", "Amphi",
                    "An", "Andro", "Ange", "Anil", "Anti", "Aoth", "Aoif",
                    "Aon", "Ara", "Are", "Areth", "Ari", "Arian", "Arth",
                    "Aster", "Astra", "Ath", "Ay", "Azr", "Ba", "Bah", "Bai", "Bal",
                    "Baltha", "Belle", "Bell", "Beo", "Bo", "Bran", "Bri", "Brun", "Bryn",
                    "Cad", "Ca", "Cai", "Calli", "Cami", "Car", "Cas", "Cassi", "Cer",
                    "Cha", "Chlo", "Chrys", "Ci", "Cle", "Con",
                    "Cor", "Cro", "Cyn", "Dae", "Damo", "Daz", "Dei", "Des", "Di", "Dio",
                    "Echi", "Echo", "Ei", "Ele", "Evan", "Fen", "Fer", "For", "Ga",
                    "Gla", "Gun", "He", "Lys", "Nyx", "Ian", "Ily", "Oli", "Will", "Vale"
            };
            String[] meaning = {"", "a the negative prefix","achos meaning 'pain'", "adon meaning lord or master", " ",
                    "aitho meaning waves", "aphros meaning foam or from afer meaning near",
                    "aner meaning man", "agro- meaning battle, slaghter", "ala meaning earth, land",
                    "alb meaning elf", "alke meaning strength, prowess",
                    "amor meaning love", "amphis meaning surrounding, around between",
                    "an meaning heaven or sky", "aner meaning man",
                    "angor meaning strangulation, torment",
                    "anila meaning air or wind", "anti meaning against",
                    "aed meaning fire", "oiph meaning beauty", "óen meaning one", "", "are meaning bane or ruin",
                    "ardo meaning water", "ari meaning most", "arian meaning silver",
                    "artos meaning bear", "aster meaning star", "aster meaning star", "", "", "",
                    "", "", "(bái) meaning \"white, pure\" ", "", "", "belos meaning dart", "",
                    "beo meaning bee", "bo meaning cow", "bran meaning raven", "",
                    "brunna meaning armour, protection", "",
                    "", "", "Chinese 财 (cái) meaning \"wealth, riches\"", "kallos meaning beauty", "", "", "", "", "",
                    "", "greek \"green\"", "", "", " kleos meaning victory", "conn, meaning sense, reason",
                    "","", "", "", "", "", "", "", "", "(Dios) meaning \"of Zeus\" ",
                    "", "meaning echo", "", "-elle meaning little", "", "", "", "", "",
                    "", "", "", "", "nyx meaning night", "", "", "", "", ""


            };

            String[] second = { "an","ar","aea", "ael","aia","adne", "ahita", "al", "ann", "bog", "cchus", "dad",
                    "demos", "dr", "dea", "dan", "den", "eas", "ena", "ene", "el", "gone", "gus",
                    "hipe", "hild", "hu", "lial", "mache", "man",
                    "meda", "mene", "mus", "me", "nos", "nus", "ope",
                    "or", "ona", "phon", "phontes", "pso", "ia", "ion","ios", "ius" ,
                    "rich", "rhod", "sar", "seis", "shen", "sto", "thus",
                    "tya", "trite", "treus", "tlas","tli", "ton",
                    "wulf", "wen", "ur", "us", "zar", "sandra", "siel",
                    "opeia", "stiel", "tor", "phyr", "pheus", "berus", "ron", "ris", "nia"
                    ,"mentia", "one", "mac", "onis", "thya","rene", "therea", "gan", "gda", "gon", "ire",
                    "cles", "dara", "nae","phne", "neira", "mne", "mos", "dre", "meter", "ana",
                    "medes", "nysus", "ktra", "lissa", "mion", "dres", "rir", "gus", "tuna",
                    "briel", "spar", "ucus", "lock", "ilyn", "lios", "lyta", "ford", "dore", "jah", "ver", "iam", "nor", "tina", "rian"
            };

            String[] meaning2 = {"","","","","", "and adnos meaning holy", "and ahita meaning unclean, dirty", "", "", "", "and iacho meaning to shout", "",
                    "and demos meaning people", "", "", "", "", "", "", "", "", "and gone meaning birth or offspring,", "and guss meaning force, strength",
                    "and hippos meaning horse", "and hildr meaning battle", "(hǔ) meaning \"tiger\".", "", "and mache meaning war", "",
                    "and medo meaning to protect, to rule over", "and mene meaning moon or menis meaning wrath", "", "", "", "", "and ops meaning voice",
                    "", "", "and (phontes) meaning \"slayer of\"", "and (phontes) meaning \"slayer of\"", "", "", "", "", "",
                    "and from rih meaning ruler, king", "and rhod meaning wheel", "", "", "神 (shén) meaning \"god\"", "", "and thoos meaning quick, nimble",
                    "","and the root found in the name Triton", "and treo meaning to fear, to flee",  "and tlao meaning to endure", "","",
                    "and wulf meaning wolf", "and gwen meaning white, blessed", "", "", "", "aner meaning man", ""
                    ,"", "", "", "", "", "", "", "", "",
                    "","","","", "", "", "", "", "", "", "",
                    "and kleos meaning victory", "and hinduism  adara meaning belly", "", "", "", "", "", "", "greek meaning mother", "",
                    "and μήδεα (medea) meaning \"plans, counsel, cunning\".", "", "", "", "","", "", "", "",
                    "", "", "", "and lock", "", "", "", "a place named ford", "", "", "", "", "", ""

            };
         System.out.println(prefix.length+" "+ meaning.length);
System.out.println(second.length + "  " + meaning2.length);
            Random rand = new Random();
            int i = rand.nextInt(prefix.length-1);
            int j = new Random().nextInt(second.length-1);
            System.out.println(prefix[i]+second[j]+" deriving from " + meaning[i] +" " + meaning2[j] +".");

        }

}

/*Favourite combos */
/*
Diophontes deriving from (Dios) meaning "of Zeus"  and (phontes) meaning "slayer of".




 */