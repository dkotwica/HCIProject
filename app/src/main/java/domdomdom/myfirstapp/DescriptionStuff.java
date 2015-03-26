package domdomdom.myfirstapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by domk1_000 on 3/26/2015.
 */
public class DescriptionStuff {
    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> BeerDescriptions = new HashMap<String, List<String>>();

        List<String> ale_beer = new ArrayList<String>();
        List<String> blonde_beer = new ArrayList<String>();
        List<String> brown_beer = new ArrayList<String>();
        List<String> dunkel_beer = new ArrayList<String>();
        List<String> fruity_beer = new ArrayList<String>();
        List<String> hoppy_beer = new ArrayList<String>();
        List<String> lager_beer = new ArrayList<String>();
        List<String> mead_beer = new ArrayList<String>();
        List<String> nitro_beer = new ArrayList<String>();
        List<String> pilsner_beer = new ArrayList<String>();
        List<String> porter_beer = new ArrayList<String>();
        List<String> saison_beer = new ArrayList<String>();
        List<String> sour_beer = new ArrayList<String>();
        List<String> stout_beer = new ArrayList<String>();
        List<String> weizen_beer = new ArrayList<String>();
        List<String> wheat_beer = new ArrayList<String>();



        ale_beer.add("Ale is a type of beer brewed from malted barley using a warm fermentation with a strain of brewers' yeast." +
        " Most ales contain hops, which help preserve the beer and impart a bitter herbal flavour that balances the sweetness of the malt."); // ale




        blonde_beer.add("Blonde Ale also called Golden Ale is a straw to medium blonde ale that has moderate bitterness and maltiness. Blonde Ale also called Golden Ale is a straw to medium blonde ale that has moderate bitterness and maltiness. Dry, light to medium body with light malty sweetness. Low to medium hop bitterness with minimal aroma. Slight fruit flavor. Light yellow to golden blonde color with no chill haze. Med to high carbonation. All malt, dry, crisp beer approximating a lager in overall character."); // blonde




        brown_beer.add("Brown ales tend to be lightly hopped, and fairly mildly flavoured, often with a nutty taste. In the south of England they are dark brown, around 3-3.5% alcohol and quite sweet; in the north they are red-brown, 4.5-5% and drier. English brown ales first appeared in the early 1900s, with Manns Brown Ale and Newcastle Brown Ale as the best-known examples."); // brown



        dunkel_beer.add("Dunkel is the German word meaning dark, and dunkel beers typically range in colour from amber to dark reddish brown. They are characterized by their smooth malty flavour.[1] In informal terms, such as when ordering at a bar, \"dunkel\" is likely to mean whatever dark beer the bar has on tap, or sells most of."); // dunkel




        fruity_beer.add("As the name might suggest, a beer brewed with a fruit. This fruit is usually the prevailing taste in the beer."); // fruity



        hoppy_beer.add("Hoppy beers inlude mainly Pale Ales, India Pale Ales (IPA), and American Ales. Hops are the female flowers of the hop plant. They are used in many beers as a flavoring and stability agent to which they impart a bitter, tangy flavor. Their main use is due to their antibacterial effect which is favored since it favors the activity of a brewer's yeast. ");
        hoppy_beer.add("Pale Ale: Pale ale was a term used for beers made from malt dried with coke. Uses a moderate amount of hops as well having a pretty strong bitterness."); // hoppy
        hoppy_beer.add("India Pale Ale: In the nineteenth century, beers from the Bow Brewery in England were exported to India, among them a pale ale which benefited exceptionally from the duration of the voyage and was highly regarded among its consumers in India. IPAs tend to have a much stronger flavor than pale ales in terms of bitterness/hoppyness and are also usually higher in alcohol content.");
        hoppy_beer.add("American Ale: Just variations of pale ales and IPAs.");


        lager_beer.add("Lagers tend to be similar to ales. They are very light tasting, highly carbonated, and usually have a smooth/balanced taste. This category of beer is probably the most extensive in all the world and thus you should not be discouraged if you dislike one lager as there many different flavors."); // lager



        mead_beer.add("Mead is an alcoholic beverage created by fermenting honey with water, and in adulterated form with various fruits, spices, grains or hops. Tastes a little similar to white wine."); // mead



        nitro_beer.add("These are like any other beer except that they are infused with nitrogen in the keg in order to allow a smooth flow. They can range from stouts to lagers. The most famous of these is guiness draught."); //nitro




        pilsner_beer.add("A type of lager, mainly a pale lager, getting its name from the city it was brewed in - Plzen, Czech Republic. Very light in flavor with a golden color. Very light in terms of hops also."); // pilsner



        porter_beer.add("A very dark beer made from brown malt. Has a mild, sweet taste but usually high in alcohol content. Porters may vary amongst each other but the most popular usually contain complex caramel or roasted flavors."); // porter




        saison_beer.add("A type of pale ale created by a Belgian brewery who made a beer called 'Saison Dupont' however Saisons are now brewed all over the world. Fairly high in alcohol percentage (usually around 7%) saisons are characterized by their strong fruit/spice flavors."); // saison




        sour_beer.add("As the name suggests, a beer which has an intentionally acidic, tart, or sour taste (not to be confused with bitter). Sour beers are made by using a longer than normal aging process as well as allowing wild yeasts and bacteria into the brew. However, this also means that the taste will usually be unpredictable."); // sour




        stout_beer.add("A dark beer made from roasted malt or roasted barley, hops, water, and yeast. Used to be synonymous with a porter, but has since split off into its own 'genre' so to speak."); // stout




        weizen_beer.add("Mainly characterized as a bavarian wheat beer (weizen actually means wheat in german) where the majority of the malted barley is replaced with malted wheat instead. Has very low hops resulting in low bitterness and high carbonation. In terms of actual flavor see wheat beer."); //weizen




        wheat_beer.add("There are 2 types, the belgian type which is characterized with flavorings of coriander and orange peel as well as using raw unmalted wheat. The german type is characterized by the German tradition of mixing at least 50% wheat to barley malt to make a light coloured top-fermenting beer."); // wheat




        BeerDescriptions.put("Ale", ale_beer);
        BeerDescriptions.put("Blonde", blonde_beer);
        BeerDescriptions.put("Brown", brown_beer);
        BeerDescriptions.put("Dunkel", dunkel_beer);
        BeerDescriptions.put("Fruity", fruity_beer);
        BeerDescriptions.put("Hoppy", hoppy_beer);
        BeerDescriptions.put("Lager", lager_beer);
        BeerDescriptions.put("Mead", mead_beer);
        BeerDescriptions.put("Nitro", nitro_beer);
        BeerDescriptions.put("Pilsner", pilsner_beer);
        BeerDescriptions.put("Porter", porter_beer);
        BeerDescriptions.put("Saison", saison_beer);
        BeerDescriptions.put("Sour", sour_beer);
        BeerDescriptions.put("Stout", stout_beer);
        BeerDescriptions.put("Weizen", weizen_beer);
        BeerDescriptions.put("Wheat", wheat_beer);




        return BeerDescriptions;

    }

}

