//Declaracion de clase
public class Heroes
{
    //Variables de instancia
    String nombre;
    String rasgo1;
    String rasgo2;
    String rasgo3;

    //Declaracion del constructor de clase
    public Heroes (String nombre, String rasgo1, String rasgo2, String rasgo3)
    {
        this.nombre = nombre;
        this.rasgo1 = rasgo1;
        this.rasgo2 = rasgo2;
        this.rasgo3 = rasgo3;
    }
    //metodos
    public String getNombre()
    { 
        return nombre;
    }
    public String getRasgo1()
    { 
        return rasgo1;
    }
    public String getRasgo2()
    { 
        return rasgo2;
    }
    public String getRasgo3()
    { 
        return rasgo3;
    }

    //Declaracion de Rasgos
    static String Crono = "crono", Cibernetico = "cibernetico", Guardiana = "guardiana", Estrella = "estrella", Celestial = "celestial", Rebelde = "rebelde";
    static String Mecha = "mecha", Pirata = "pirata", Valquiria = "valquiria", Vacio = "vacio", Protector = "protector", Infiltrado = "infiltrado";
    static String Blaster = "blaster", Espadachin = "espadachin", Hechiceros = "hechiceros", Luchador = "luchador", Tirador = "tirador", Vanguardia = "vanguardia"; 
    static String Mistico = "mistico", Pirotecnico = "pirotecnico", Mercenario = "mercenario", Segador = "segador", Nave = "nave", Cero = "";
    
    //Declaracion de contador de rasgos
    static int crono = 0, cibernetico = 0, guardiana = 0, estrella = 0, celestial = 0, rebelde = 0;
    static int mecha = 0, pirata = 0, valquiria = 0, vacio = 0, protector = 0, infiltrado = 0;
    static int blaster = 0, espadachin = 0, hechiceros = 0, luchador = 0, tirador = 0, vanguardia = 0; 
    static int mistico = 0, pirotecnico = 0, mercenario = 0, segador = 0, nave = 0, cero = 0;

    //Niveles de rasgos
    static int oro = 0, plata = 0, bronce = 0, sumador = 0, spat = 0;
    static String espatula = "";
    
    public static void main(String[] args) {
        

        //Creacion de arreglo con los campeones dispinibles
        Heroes[] Tabla = new Heroes[51];

        Heroes zoe = new Heroes("zoe", Guardiana, Hechiceros, Cero);
        Heroes poppy = new Heroes("poppy", Guardiana, Vanguardia, Cero);
        Heroes ziggs = new Heroes("ziggs", Rebelde, Pirotecnico, Cero);
        Heroes leona = new Heroes("leona", Cibernetico, Vanguardia, Cero);
        Heroes fiora = new Heroes("fiora", Cibernetico, Espadachin, Cero);
        Heroes xayah = new Heroes("xayah", Celestial, Espadachin, Cero);
        Heroes twisted = new Heroes("twisted", Crono, Hechiceros, Cero);
        Heroes malphite = new Heroes("malphite", Rebelde, Luchador, Cero);
        Heroes khazhix = new Heroes("khszhix", Vacio, Infiltrado, Cero);
        Heroes jarvan = new Heroes("jarvan", Estrella, Vacio, Cero);
        Heroes caitlyn = new Heroes("caitlyn", Crono, Tirador, Cero);
        Heroes graves = new Heroes("graves", Pirata, Blaster, Cero);
        Heroes ahri = new Heroes("ahri", Guardiana, Hechiceros, Cero);
        Heroes annie = new Heroes("annie", Mecha, Hechiceros, Cero);
        Heroes rakan = new Heroes("rakan", Celestial, Protector, Cero);
        Heroes shen = new Heroes("shen", Crono, Espadachin, Cero);
        Heroes xin = new Heroes("xin", Celestial, Protector, Cero);
        Heroes yasuo = new Heroes("yasuo", Rebelde, Espadachin, Cero);
        Heroes sona = new Heroes("sona", Rebelde, Mistico, Cero);
        Heroes mordekaiser = new Heroes("mordekaiser", Estrella, Vanguardia, Cero);
        Heroes kaisa = new Heroes("kaisa", Valquiria, Infiltrado, Cero);
        Heroes darius = new Heroes("darius", Pirata, Segador, Cero);
        Heroes blitz = new Heroes("blitz", Crono, Luchador, Cero);
        Heroes lucian = new Heroes("lucian", Cibernetico, Blaster, Cero);
        Heroes neeko = new Heroes("neeko", Guardiana, Protector, Cero);
        Heroes syndra = new Heroes("syndra", Guardiana, Hechiceros, Cero);
        Heroes rumble = new Heroes("rumble", Mecha, Pirotecnico, Cero);
        Heroes vi = new Heroes("vi", Cibernetico, Luchador, Cero);
        Heroes ashe = new Heroes("ashe", Celestial, Tirador, Cero);
        Heroes karma = new Heroes("karma", Mistico, Estrella, Cero);
        Heroes shaco = new Heroes("shaco", Infiltrado, Estrella, Cero);
        Heroes lux = new Heroes("lux", Hechiceros, Estrella, Cero);
        Heroes kassadin = new Heroes("kassadin", Celestial, Segador, Cero);
        Heroes yi = new Heroes("yi", Rebelde, Espadachin, Cero);
        Heroes ezreal = new Heroes("ezreal", Crono, Blaster, Cero);
        Heroes jayce = new Heroes("jayce", Pirata, Vanguardia, Cero);
        Heroes soraka = new Heroes("soraka", Guardiana, Mistico, Cero);
        Heroes fizz = new Heroes("fizz", Mecha, Infiltrado, Cero);
        Heroes irelia = new Heroes("irelia", Cibernetico, Segador, Espadachin);
        Heroes jinx = new Heroes("jinx", Rebelde, Blaster, Cero);
        Heroes kayle = new Heroes("kayle", Valquiria, Espadachin, Cero);
        Heroes wukong = new Heroes("wukong", Crono, Vanguardia, Cero);
        Heroes velkoz = new Heroes("velkoz", Vacio, Hechiceros, Cero);
        Heroes chogat = new Heroes("chogat", Vacio, Luchador, Cero);
        Heroes jhin = new Heroes("jhin", Estrella, Tirador, Cero);
        Heroes ekko = new Heroes("ekko", Cibernetico, Infiltrado, Cero);
        Heroes aurelion = new Heroes("aurelion", Rebelde, Nave, Cero);
        Heroes lulu = new Heroes("lulu", Celestial, Mistico, Cero);
        Heroes thresh = new Heroes("thresh", Crono, Segador, Cero);
        Heroes gangplank = new Heroes("gangplank", Mercenario, Pirata, Pirotecnico);
        Heroes miss = new Heroes("miss", Valquiria, Mercenario, Blaster);

        //Asignacion de campiones en la tabla
        Tabla[0] = zoe;
        Tabla[1] = poppy;
        Tabla[2] = ziggs;
        Tabla[3] = leona;
        Tabla[4] = fiora;
        Tabla[5] = xayah;
        Tabla[6] = twisted;
        Tabla[7] = malphite;
        Tabla[8] = khazhix;
        Tabla[9] = jarvan;
        Tabla[10] = caitlyn;
        Tabla[11] = graves;
        Tabla[12] = ahri;
        Tabla[13] = annie;
        Tabla[14] = rakan;
        Tabla[15] = shen;
        Tabla[16] = xin;
        Tabla[17] = yasuo;
        Tabla[18] = sona;
        Tabla[19] = mordekaiser;
        Tabla[20] = kaisa;
        Tabla[21] = darius;
        Tabla[22] = blitz;
        Tabla[23] = lucian;
        Tabla[24] = neeko;
        Tabla[25] = syndra;
        Tabla[26] = rumble;
        Tabla[27] = vi;
        Tabla[28] = ashe;
        Tabla[29] = karma;
        Tabla[30] = shaco;
        Tabla[31] = lux;
        Tabla[32] = kassadin;
        Tabla[33] = yi;
        Tabla[34] = ezreal;
        Tabla[35] = jayce;
        Tabla[36] = soraka;
        Tabla[37] = fizz;
        Tabla[38] = irelia;
        Tabla[39] = jinx;
        Tabla[40] = kayle;
        Tabla[41] = wukong;
        Tabla[42] = velkoz;
        Tabla[43] = chogat;
        Tabla[44] = jhin;
        Tabla[45] = ekko;
        Tabla[46] = aurelion;
        Tabla[47] = lulu;
        Tabla[48] = thresh;
        Tabla[49] = gangplank;
        Tabla[50] = miss;
        

        for (int i = 0; i <= 43; i++)
        {
            System.out.println(Tabla[i].nombre);
            for (int j = i + 1; j <= 44; j++) 
            {
                for (int k = j + 1; k <= 45; k++)
                {
                    for (int l = k + 1; l <= 46; l++)
                    {
                        for (int m = l + 1; m <= 47; m++)
                        {
                            for (int n = m + 1; n <= 48; n++)
                            {
                                for (int o = n + 1; o <= 49; o++)
                                {
                                    for (int p = o + 1; p <= 50; p++)
                                    {
                                        contarRasgos(Tabla[i].rasgo1, Tabla[i].rasgo2, Tabla[i].rasgo3);
                                        contarRasgos(Tabla[j].rasgo1, Tabla[j].rasgo2, Tabla[j].rasgo3);
                                        contarRasgos(Tabla[k].rasgo1, Tabla[k].rasgo2, Tabla[k].rasgo3);
                                        contarRasgos(Tabla[l].rasgo1, Tabla[l].rasgo2, Tabla[l].rasgo3);
                                        contarRasgos(Tabla[m].rasgo1, Tabla[m].rasgo2, Tabla[m].rasgo3);
                                        contarRasgos(Tabla[n].rasgo1, Tabla[n].rasgo2, Tabla[n].rasgo3);
                                        contarRasgos(Tabla[o].rasgo1, Tabla[o].rasgo2, Tabla[o].rasgo3);
                                        contarRasgos(Tabla[p].rasgo1, Tabla[p].rasgo2, Tabla[p].rasgo3);
                                        int comparer = compararRangos();
                                        //if ((sumador > 18 && (oro > 0 | plata > 0)) | sumador > 18)
                                        if (comparer == 0) 
                                        {
                                            System.out.println(Tabla[i].nombre + ", " + Tabla[j].nombre + ", " + Tabla[k].nombre + ", " +
                                            Tabla[l].nombre + ", " + Tabla[m].nombre + ", " + Tabla[n].nombre + ", " + Tabla[o].nombre + ", " +
                                            Tabla[p].nombre + ". Oro: " + oro + ", Plata: " + plata + ", Bronce: " + bronce + " "+ comparer +" "+ sumador + " " + espatula);
                                            System.out.println();
                                        }
                                        //if (comparer == 1 && sumador > 12) 
                                        //{
                                        //    Console.Write(Tabla[i].Nombre + ", " + Tabla[j].Nombre + ", " + Tabla[k].Nombre + ", " +
                                        //    Tabla[l].Nombre + ", " + Tabla[m].Nombre + ", " + Tabla[n].Nombre + ", " + Tabla[o].Nombre + ", " +
                                        //    Tabla[p].Nombre + ". Oro: " + oro + ", Plata: " + plata + ", Bronce: " + bronce + ". 1");
                                        //    Console.WriteLine();
                                        //}
                                        BorrarDatos();

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    private static void contarRasgos (String cadena1, String cadena2, String cadena3)
    {
        if (cadena1 == Crono | cadena2 == Crono | cadena3 == Crono) 
            crono++;
        if (cadena1 == Cibernetico | cadena2 == Cibernetico | cadena3 == Cibernetico)
            cibernetico++;
        if (cadena1 == Guardiana | cadena2 == Guardiana | cadena3 == Guardiana)
            guardiana++;
        if (cadena1 == Estrella | cadena2 == Estrella | cadena3 == Estrella)
            estrella++;
        if (cadena1 == Celestial | cadena2 == Celestial | cadena3 == Celestial)
            celestial++;
        if (cadena1 == Rebelde | cadena2 == Rebelde | cadena3 == Rebelde)
            rebelde++;
        if (cadena1 == Mecha | cadena2 == Mecha | cadena3 == Mecha)
            mecha++;
        if (cadena1 == Pirata | cadena2 == Pirata | cadena3 == Pirata)
            pirata++;
        if (cadena1 == Valquiria | cadena2 == Valquiria | cadena3 == Valquiria)
            valquiria++;
        if (cadena1 == Vacio | cadena2 == Vacio | cadena3 == Vacio)
            vacio++;
        if (cadena1 == Protector | cadena2 == Protector | cadena3 == Protector)
            protector++;
        if (cadena1 == Infiltrado | cadena2 == Infiltrado | cadena3 == Infiltrado)
            infiltrado++;
        if (cadena1 == Blaster | cadena2 == Blaster | cadena3 == Blaster)
            blaster++;
        if (cadena1 == Espadachin | cadena2 == Espadachin | cadena3 == Espadachin)
            espadachin++;
        if (cadena1 == Hechiceros | cadena2 == Hechiceros | cadena3 == Hechiceros)
            hechiceros++;
        if (cadena1 == Luchador | cadena2 == Luchador | cadena3 == Luchador)
            luchador++;
        if (cadena1 == Tirador | cadena2 == Tirador | cadena3 == Tirador)
            tirador++;
        if (cadena1 == Vanguardia | cadena2 == Vanguardia | cadena3 == Vanguardia)
            vanguardia++;
        if (cadena1 == Mistico | cadena2 == Mistico | cadena3 == Mistico)
            mistico++;
        if (cadena1 == Pirotecnico | cadena2 == Pirotecnico | cadena3 == Pirotecnico)
            pirotecnico++;
        if (cadena1 == Mercenario | cadena2 == Mercenario | cadena3 == Mercenario)
            mercenario++;
        if (cadena1 == Segador | cadena2 == Segador | cadena3 == Segador)
            segador++;
        if (cadena1 == Nave | cadena2 == Nave | cadena3 == Nave)
            nave++;
    }
    private static int compararRangos()
    {
        int conter = 23;
        if (crono == 0 | crono == 2 | crono == 4 | crono == 6)
        {
            conter--;
            compararCalidad(246, crono);
        }
        if (cibernetico == 0 | cibernetico == 3 | cibernetico == 6)
        {
            conter--;
            compararCalidad(36, cibernetico);
        }
        if (guardiana == 0 | guardiana == 3 | guardiana == 6) /*| (spat == 0 && guardiana == 2 | guardiana == 5))/*/
        {
            /*if (guardiana == 2 | guardiana == 5 && espatula == "") 
            {
                spat = 1;
                guardiana++;
                espatula = "guardiana";
            }*/
            conter--;
            compararCalidad(36, guardiana);
        }
        if (estrella == 0 | estrella == 3 | estrella == 6) /*| (spat == 0 && estrella == 2 | estrella == 5))/*/
        {
            /*if (estrella == 2 | estrella == 5 && espatula == "")
            {
                spat = 1;
                estrella++;
                espatula = "estrella";
            }*/
            conter--;
            compararCalidad(36, estrella);
        }
        if (celestial == 0 | celestial == 2 | celestial == 4 | celestial == 6) /*| (spat == 0 && celestial == 1 | celestial == 3 | celestial == 5))/*/
        {
            /*if (celestial == 1 | celestial == 3 | celestial == 5 && espatula == "")
            {
                spat = 1;
                celestial++;
                espatula = "celestial";
            }*/
            conter--;
            compararCalidad(246, celestial);
        }
        if (rebelde == 0 | rebelde == 3 | rebelde == 6) /*| (spat == 0 && rebelde == 2 | rebelde == 5))/*/
        {
            /*if (rebelde == 2 | rebelde == 5 && espatula == "")
            {
                spat = 1;
                rebelde++;
                espatula = "rebelde";
            }*/
            conter--;
            compararCalidad(36, rebelde);
        }
        if (mecha == 0 | mecha == 3)
        {
            conter--;
            compararCalidad(3, mecha);
        }
        if (pirata == 0 | pirata == 2 | pirata == 4)
        {
            conter--;
            compararCalidad(24, pirata);
        }
        if (valquiria == 0 | valquiria == 2)
        {
            conter--;
            compararCalidad(2, valquiria);
        }
        if (vacio == 0 | vacio == 3)
        {
            conter--;
            compararCalidad(3, vacio);
        }
        if (protector == 0 | protector == 2 | protector == 4) /*| (spat == 0 && protector == 1 | protector == 3))/*/
        {
            /*if (protector == 1 | protector == 3 && espatula == "")
            {
                spat = 1;
                protector++;
                espatula = "protector";
            }*/
            conter--;
            compararCalidad(24, protector);
        }
        if (infiltrado == 0 | infiltrado == 2 | infiltrado == 4) /*| (spat == 0 && infiltrado == 1 | infiltrado == 3))/*/
        {
            /*if (infiltrado == 1 | infiltrado == 3 && espatula == "")
            {
                spat = 1;
                infiltrado++;
                espatula = "infiltrado";
            }*/
            conter--;
            compararCalidad(24, infiltrado);
        }
        if (blaster == 0 | blaster == 2 | blaster == 4)
        {
            conter--;
            compararCalidad(24, blaster);
        }
        if (espadachin == 0 | espadachin == 3 | espadachin == 6) /*| (spat == 0 && espadachin == 2 | espadachin == 5))/*/
        {
            /*if (espadachin == 2 | espadachin == 5 && espatula == "")
            {
                spat = 1;
                espadachin++;
                espatula = "espadachin";
            }*/
            conter--;
            compararCalidad(36, espadachin);
        }
        if (hechiceros == 0 | hechiceros == 2 | hechiceros == 4 | hechiceros == 6)
        {
            conter--;
            compararCalidad(246, hechiceros);
        }
        if (luchador == 0 | luchador == 2 | luchador == 4) 
        {
            conter--;
            compararCalidad(24, luchador);
        }
        if (tirador == 0 | tirador == 2)
        {
            conter--;
            compararCalidad(2, tirador);
        }
        if (vanguardia == 0 | vanguardia == 2 | vanguardia == 4)
        {
            conter--;
            compararCalidad(24, vanguardia);
        }
        if (mistico == 0 | mistico == 2 | mistico == 4)
        {
            conter--;
            compararCalidad(24, mistico);
        }
        if (pirotecnico == 0 | pirotecnico == 2) /*| ( spat == 0 && pirotecnico == 1 ))/*/
        {
            /*if (pirotecnico == 1 && espatula == "")
            {
                spat = 1;
                pirotecnico++;
                espatula = "pirotecnico";
            }*/
            conter--;
            compararCalidad(24, pirotecnico);
        }
        if (mercenario == 0 | mercenario == 1)
        {
            conter--;
            compararCalidad(1, mercenario);
        }
        if (segador == 0 | segador == 2 | segador == 4)
        {
            conter--;
            compararCalidad(24, segador); 
        }
        if (nave == 0 | nave == 1)
        {
            conter--;
            compararCalidad(1, nave);
        }
        
        //sumador = Convert.ToInt32(oro * 3 + plata * 2 + bronce);
        return conter;
    }
    private static void BorrarDatos()
    {
        crono = 0; cibernetico = 0; guardiana = 0; estrella = 0; celestial = 0; rebelde = 0;
        mecha = 0; pirata = 0; valquiria = 0; vacio = 0; protector = 0; infiltrado = 0;
        blaster = 0; espadachin = 0; hechiceros = 0; luchador = 0; tirador = 0; vanguardia = 0;
        mistico = 0; pirotecnico = 0; mercenario = 0; segador = 0; nave = 0; cero = 0;
        oro = 0; plata = 0; bronce = 0; sumador = 0; spat = 0;
        espatula = "";
    }
    private static void compararCalidad(int rangos, int numero)
    {
        sumador += numero;
        //234 1 36 3 246 24 2 369
        if (rangos==234)
        {
            if (numero >= 4)
                oro++;
            else if (numero >= 3)
                plata++;
            else if (numero >= 2)
                bronce++;
        }
        if ((rangos == 1 | rangos == 2 | rangos == 3) && numero > 0)  
        {
                oro++;
        }
        if (rangos == 36)
        {
            if (numero >= 6)
                oro++;
            else if (numero >= 3)
                bronce++;
        }
        if (rangos == 246)
        {
            if (numero >= 6)
                oro++;
            else if (numero >= 4)
                plata++;
            else if (numero >= 2)
                bronce++;
        }
        if (rangos == 24)
        {
            if (numero >= 4)
                oro++;
            else if (numero >= 2)
                bronce++;
        }
        if (rangos == 369)
        {
            if (numero >= 9)
                oro++;
            else if (numero >= 6)
                plata++;
            else if (numero >= 3)
                bronce++;
        }

    }
}

