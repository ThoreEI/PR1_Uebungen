package klaus_se21_sommer;

public class Aufgabe2 {
    public static void main(String[] args) {

        System.out.println(earth2vulcan(29, 2, false));
//                %%% "Das vulcanische Jahr besitzt genau so viele Tage wie ein Erdenjahr. Die Monatsnamen entfallen wegen Ihrer
//                %%%  Unlogik. Das vulcanische Datum ergibt sich aus dem reinen Durchzählen der Tage. Der 31. Januar (irdisch)
//                %%%  entspricht 31 (vulcan), der 1. Februar (irdisch) entspricht 32, der 3. Februar (irdisch) entspricht 34."
//                %%% Denken Sie an das Schaltjahr. Inkorrekte Datumsparameter, wie der 31. April sollen als Ergebnis -1 liefern,

//
    }

    public static int earth2vulcan(int tag, int monat, boolean isSchaltjahr) {
        if (tag < 1 || monat == 2 && (isSchaltjahr && tag > 29 || !isSchaltjahr && tag > 28))
            return -1;
        if (monat % 2 == 1 && tag > 31 || monat % 2 == 0 && tag > 30)
            return -1;

        int date = 0;
        for (int tmpMonat = 1; tmpMonat < monat; tmpMonat++)
            if (tmpMonat % 2 == 1)
                date += 31;
            else if (tmpMonat == 2)
                if (isSchaltjahr)
                    date += 29;
                else
                    date += 28;
            else
                date += 30;

        return date + tag;
    }

}
