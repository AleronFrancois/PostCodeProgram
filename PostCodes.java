/** -------------------------------------------------
                KIT107 Assignment 1                                    
  * 
  * PostCode Finder -- Library Class
  * File Location -- PostCodePorgram/PostCodes.java 
  * 
  * @author - Aleron Francois (691807)
  *         - Ethan Marsden (510598)
  *         - Julian Dermoudy
  * -------------------------------------------------
  * @version 2.0
  * @since 14/3/2025
  * -------------------------------------------------
  * Allows the user to get a list of postcodes within
  * Tasmania and the suburbs/towns they contain. 
  * -------------------------------------------------
**/


import java.util.InputMismatchException;
import java.util.Scanner;


public class PostCodes implements PostCodesInterface {
    // List of all suburbs for each postcode in tasmania
    protected final String POSTCODES[][]={
        {"7000","Glebe"},
        {"7000","Hobart"},
        {"7000","Mount Stuart"},
        {"7000","North Hobart"},
        {"7000","Queens Domain"},
        {"7000","West Hobart"},
        {"7001","Hobart"},
        {"7001","Tasman Island"},
        {"7002","North Hobart"},
        {"7004","Battery Point"},
        {"7004","South Hobart"},
        {"7005","Dynnyrne"},
        {"7005","Lower Sandy Bay"},
        {"7005","Sandy Bay"},
        {"7005","University Of Tasmania"},
        {"7006","Sandy Bay"},
        {"7007","Mount Nelson"},
        {"7007","Tolmans Hill"},
        {"7008","Cornelian Bay"},
        {"7008","Lenah Valley"},
        {"7008","New Town"},
        {"7009","Derwent Park"},
        {"7009","Lutana"},
        {"7009","Moonah"},
        {"7009","West Moonah"},
        {"7010","Dowsing Point"},
        {"7010","Elwick"},
        {"7010","Glenorchy"},
        {"7010","Goodwood"},
        {"7010","Montrose"},
        {"7010","Rosetta"},
        {"7011","Austins Ferry"},
        {"7011","Berriedale"},
        {"7011","Chigwell"},
        {"7011","Claremont"},
        {"7012","Collinsvale"},
        {"7012","Glenlusk"},
        {"7015","Flagstaff Gully"},
        {"7015","Geilston Bay"},
        {"7015","Lindisfarne"},
        {"7015","Rose Bay"},
        {"7016","Risdon Vale"},
        {"7017","Grasstree Hill"},
        {"7017","Honeywood"},
        {"7017","Old Beach"},
        {"7017","Otago"},
        {"7017","Risdon"},
        {"7017","Tea Tree"},
        {"7018","Bellerive"},
        {"7018","Howrah"},
        {"7018","Montagu Bay"},
        {"7018","Mornington"},
        {"7018","Rosny"},
        {"7018","Rosny Park"},
        {"7018","Tranmere"},
        {"7018","Warrane"},
        {"7019","Clarendon Vale"},
        {"7019","Oakdowns"},
        {"7019","Rokeby"},
        {"7020","Clifton Beach"},
        {"7020","Sandford"},
        {"7021","Lauderdale"},
        {"7022","South Arm"},
        {"7023","Opossum Bay"},
        {"7024","Cremorne"},
        {"7025","Dulcot"},
        {"7025","Richmond"},
        {"7026","Campania"},
        {"7027","Colebrook"},
        {"7030","Apsley"},
        {"7030","Arthurs Lake"},
        {"7030","Bagdad"},
        {"7030","Bagdad North"},
        {"7030","Bothwell"},
        {"7030","Bridgewater"},
        {"7030","Brighton"},
        {"7030","Broadmarsh"},
        {"7030","Cramps Bay"},
        {"7030","Dromedary"},
        {"7030","Dysart"},
        {"7030","Elderslie"},
        {"7030","Flintstone"},
        {"7030","Gagebrook"},
        {"7030","Granton"},
        {"7030","Hermitage"},
        {"7030","Interlaken"},
        {"7030","Jericho"},
        {"7030","Kempton"},
        {"7030","Lake Sorell"},
        {"7030","Liawenee"},
        {"7030","Lower Marshes"},
        {"7030","Mangalore"},
        {"7030","Melton Mowbray"},
        {"7030","Miena"},
        {"7030","Millers Bluff"},
        {"7030","Morass Bay"},
        {"7030","Pelham"},
        {"7030","Pontville"},
        {"7030","Shannon"},
        {"7030","Steppes"},
        {"7030","Tods Corner"},
        {"7030","Waddamana"},
        {"7030","Wilburville"},
        {"7050","Albion Heights"},
        {"7050","Kingston"},
        {"7050","Kingston Beach"},
        {"7051","Kingston"},
        {"7052","Blackmans Bay"},
        {"7053","Bonnet Hill"},
        {"7053","Taroona"},
        {"7054","Barretta"},
        {"7054","Coningham"},
        {"7054","Electrona"},
        {"7054","Fern Tree"},
        {"7054","Howden"},
        {"7054","Leslie Vale"},
        {"7054","Lower Snug"},
        {"7054","Margate"},
        {"7054","Neika"},
        {"7054","Piersons Point"},
        {"7054","Ridgeway"},
        {"7054","Snug"},
        {"7054","Tinderbox"},
        {"7054","Wellington Park"},
        {"7055","Huntingfield"},
        {"7109","Catamaran"},
        {"7109","Crabtree"},
        {"7109","Cradoc"},
        {"7109","Glaziers Bay"},
        {"7109","Glen Huon"},
        {"7109","Glendevie"},
        {"7109","Grove"},
        {"7109","Hastings"},
        {"7109","Huonville"},
        {"7109","Ida Bay"},
        {"7109","Judbury"},
        {"7109","Lonnavale"},
        {"7109","Lower Longley"},
        {"7109","Lower Wattle Grove"},
        {"7109","Lucaston"},
        {"7109","Lune River"},
        {"7109","Lymington"},
        {"7109","Mountain River"},
        {"7109","Petcheys Bay"},
        {"7109","Raminea"},
        {"7109","Ranelagh"},
        {"7109","Recherche"},
        {"7109","Southport"},
        {"7109","Southport Lagoon"},
        {"7109","Strathblane"},
        {"7109","Waterloo"},
        {"7109","Wattle Grove"},
        {"7109","Woodstock"},
        {"7112","Abels Bay"},
        {"7112","Charlotte Cove"},
        {"7112","Cygnet"},
        {"7112","Deep Bay"},
        {"7112","Eggs And Bacon Bay"},
        {"7112","Garden Island Creek"},
        {"7112","Gardners Bay"},
        {"7112","Nicholls Rivulet"},
        {"7112","Randalls Bay"},
        {"7112","Verona Sands"},
        {"7113","Franklin"},
        {"7116","Brooks Bay"},
        {"7116","Cairns Bay"},
        {"7116","Castle Forbes Bay"},
        {"7116","Geeveston"},
        {"7116","Police Point"},
        {"7116","Port Huon"},
        {"7116","Surges Bay"},
        {"7116","Surveyors Bay"},
        {"7117","Dover"},
        {"7119","Stonor"},
        {"7120","Andover"},
        {"7120","Antill Ponds"},
        {"7120","Baden"},
        {"7120","Lemont"},
        {"7120","Levendale"},
        {"7120","Mount Seymour"},
        {"7120","Oatlands"},
        {"7120","Parattah"},
        {"7120","Pawtella"},
        {"7120","Rhyndaston"},
        {"7120","Stonehenge"},
        {"7120","Swanston"},
        {"7120","Tiberias"},
        {"7120","Tunbridge"},
        {"7120","Tunnack"},
        {"7120","Whitefoord"},
        {"7120","Woodbury"},
        {"7120","Woodsdale"},
        {"7120","York Plains"},
        {"7139","Strathgordon"},
        {"7140","Black Hills"},
        {"7140","Boyer"},
        {"7140","Bradys Lake"},
        {"7140","Bronte Park"},
        {"7140","Bushy Park"},
        {"7140","Butlers Gorge"},
        {"7140","Dee"},
        {"7140","Derwent Bridge"},
        {"7140","Ellendale"},
        {"7140","Fentonbury"},
        {"7140","Fitzgerald"},
        {"7140","Florentine"},
        {"7140","Glenfern"},
        {"7140","Glenora"},
        {"7140","Gretna"},
        {"7140","Hamilton"},
        {"7140","Hayes"},
        {"7140","Hollow Tree"},
        {"7140","Karanja"},
        {"7140","Lachlan"},
        {"7140","Lake St Clair"},
        {"7140","Lawitta"},
        {"7140","Little Pine Lagoon"},
        {"7140","London Lakes"},
        {"7140","Macquarie Plains"},
        {"7140","Magra"},
        {"7140","Malbina"},
        {"7140","Maydena"},
        {"7140","Meadowbank"},
        {"7140","Molesworth"},
        {"7140","Moogara"},
        {"7140","Mount Field"},
        {"7140","Mount Lloyd"},
        {"7140","National Park"},
        {"7140","New Norfolk"},
        {"7140","Osterley"},
        {"7140","Ouse"},
        {"7140","Plenty"},
        {"7140","Rosegarland"},
        {"7140","Sorell Creek"},
        {"7140","Strickland"},
        {"7140","Styx"},
        {"7140","Tarraleah"},
        {"7140","Tyenna"},
        {"7140","Uxbridge"},
        {"7140","Victoria Valley"},
        {"7140","Wayatinah"},
        {"7140","Westerway"},
        {"7150","Adventure Bay"},
        {"7150","Allens Rivulet"},
        {"7150","Alonnah"},
        {"7150","Apollo Bay"},
        {"7150","Barnes Bay"},
        {"7150","Dennes Point"},
        {"7150","Gordon"},
        {"7150","Great Bay"},
        {"7150","Kaoota"},
        {"7150","Killora"},
        {"7150","Longley"},
        {"7150","Lunawanna"},
        {"7150","North Bruny"},
        {"7150","Oyster Cove"},
        {"7150","Pelverata"},
        {"7150","Sandfly"},
        {"7150","Simpsons Bay"},
        {"7150","South Bruny"},
        {"7150","Upper Woodstock"},
        {"7151","Casey"},
        {"7151","Davis"},
        {"7151","Macquarie"},
        {"7151","Macquarie Island"},
        {"7151","Mawson"},
        {"7155","Kettering"},
        {"7162","Birchs Bay"},
        {"7162","Woodbridge"},
        {"7163","Flowerpot"},
        {"7163","Middleton"},
        {"7170","Acton Park"},
        {"7170","Cambridge"},
        {"7170","Mount Rumney"},
        {"7170","Roches Beach"},
        {"7170","Seven Mile Beach"},
        {"7171","Midway Point"},
        {"7171","Penna"},
        {"7172","Nugent"},
        {"7172","Orielton"},
        {"7172","Pawleena"},
        {"7172","Sorell"},
        {"7172","Wattle Hill"},
        {"7173","Carlton"},
        {"7173","Carlton River"},
        {"7173","Connellys Marsh"},
        {"7173","Dodges Ferry"},
        {"7173","Forcett"},
        {"7173","Lewisham"},
        {"7173","Primrose Sands"},
        {"7174","Copping"},
        {"7175","Bream Creek"},
        {"7175","Marion Bay"},
        {"7176","Kellevie"},
        {"7177","Boomer Bay"},
        {"7177","Dunalley"},
        {"7178","Murdunna"},
        {"7179","Eaglehawk Neck"},
        {"7180","Taranna"},
        {"7182","Fortescue"},
        {"7182","Port Arthur"},
        {"7183","Highcroft"},
        {"7184","Nubeena"},
        {"7184","Stormlea"},
        {"7184","White Beach"},
        {"7185","Premaydena"},
        {"7186","Saltwater River"},
        {"7186","Sloping Main"},
        {"7187","Koonya"},
        {"7190","Apslawn"},
        {"7190","Buckland"},
        {"7190","Cranbrook"},
        {"7190","Dolphin Sands"},
        {"7190","Little Swanport"},
        {"7190","Maria Island"},
        {"7190","Orford"},
        {"7190","Pontypool"},
        {"7190","Rheban"},
        {"7190","Rocky Hills"},
        {"7190","Runnymede"},
        {"7190","Spring Beach"},
        {"7190","Swansea"},
        {"7190","Triabunna"},
        {"7209","Ross"},
        {"7209","Tooms Lake"},
        {"7210","Campbell Town"},
        {"7210","Lake Leake"},
        {"7211","Cleveland"},
        {"7211","Conara"},
        {"7211","Epping Forest"},
        {"7212","Ben Lomond"},
        {"7212","Blessington"},
        {"7212","Burns Creek"},
        {"7212","Deddington"},
        {"7212","Evandale"},
        {"7212","Nile"},
        {"7212","Upper Blessington"},
        {"7212","Western Junction"},
        {"7213","Avoca"},
        {"7213","Rossarden"},
        {"7213","Royal George"},
        {"7214","Fingal"},
        {"7214","Mangana"},
        {"7214","Mathinna"},
        {"7214","Upper Esk"},
        {"7215","Beaumaris"},
        {"7215","Bicheno"},
        {"7215","Chain Of Lagoons"},
        {"7215","Coles Bay"},
        {"7215","Cornwall"},
        {"7215","Douglas River"},
        {"7215","Falmouth"},
        {"7215","Four Mile Creek"},
        {"7215","Freycinet"},
        {"7215","Friendly Beaches"},
        {"7215","Gray"},
        {"7215","Scamander"},
        {"7215","Seymour"},
        {"7215","St Marys"},
        {"7215","Upper Scamander"},
        {"7216","Akaroa"},
        {"7216","Ansons Bay"},
        {"7216","Binalong Bay"},
        {"7216","Goshen"},
        {"7216","Goulds Country"},
        {"7216","Lottah"},
        {"7216","Pyengana"},
        {"7216","St Helens"},
        {"7216","Stieglitz"},
        {"7216","The Gardens"},
        {"7248","Alanvale"},
        {"7248","Inveresk"},
        {"7248","Invermay"},
        {"7248","Mayfield"},
        {"7248","Mowbray"},
        {"7248","Mowbray Heights"},
        {"7248","Newnham"},
        {"7248","Rocherlea"},
        {"7249","Glen Dhu"},
        {"7249","Kings Meadows"},
        {"7249","Punchbowl"},
        {"7249","Sandhill"},
        {"7249","South Launceston"},
        {"7249","Youngtown"},
        {"7250","Blackstone Heights"},
        {"7250","East Launceston"},
        {"7250","Elphin"},
        {"7250","Launceston"},
        {"7250","Newstead"},
        {"7250","Norwood"},
        {"7250","Prospect"},
        {"7250","Ravenswood"},
        {"7250","Riverside"},
        {"7250","St Leonards"},
        {"7250","Summerhill"},
        {"7250","Travellers Rest"},
        {"7250","Trevallyn"},
        {"7250","Waverley"},
        {"7250","West Launceston"},
        {"7252","Beechford"},
        {"7252","Dilston"},
        {"7252","Hillwood"},
        {"7252","Lefroy"},
        {"7252","Lulworth"},
        {"7252","Mount Direction"},
        {"7252","Pipers River"},
        {"7252","Stony Head"},
        {"7252","Swan Bay"},
        {"7252","Weymouth"},
        {"7252","Windermere"},
        {"7253","Bell Bay"},
        {"7253","George Town"},
        {"7253","Long Reach"},
        {"7253","Low Head"},
        {"7254","Bellingham"},
        {"7254","Golconda"},
        {"7254","Lebrina"},
        {"7254","Pipers Brook"},
        {"7254","Retreat"},
        {"7254","Tunnel"},
        {"7254","Wyena"},
        {"7255","Blue Rocks"},
        {"7255","Emita"},
        {"7255","Killiecrankie"},
        {"7255","Lackrana"},
        {"7255","Lady Barron"},
        {"7255","Leeka"},
        {"7255","Loccota"},
        {"7255","Lughrata"},
        {"7255","Memana"},
        {"7255","Palana"},
        {"7255","Ranga"},
        {"7255","Strzkecki"},
        {"7255","Whitemark"},
        {"7255","Wingaroo"},
        {"7256","Bungaree"},
        {"7256","Currie"},
        {"7256","Egg Lagoon"},
        {"7256","Grassy"},
        {"7256","Loorana"},
        {"7256","Lymwood"},
        {"7256","Naracoopa"},
        {"7256","Nugara"},
        {"7256","Pearshape"},
        {"7256","Pegarah"},
        {"7256","Reekara"},
        {"7256","Sea Elephant"},
        {"7256","Wickham"},
        {"7256","Yambacoona"},
        {"7256","Yarra Creek"},
        {"7257","Cape Barren Island"},
        {"7258","Breadalbane"},
        {"7258","Relbia"},
        {"7258","White Hills"},
        {"7259","Myrtle Bank"},
        {"7259","Nunamara"},
        {"7259","Patersonia"},
        {"7259","Targa"},
        {"7259","Tayene"},
        {"7260","Blumont"},
        {"7260","Cuckoo"},
        {"7260","Forester"},
        {"7260","Jetsonville"},
        {"7260","Kamona"},
        {"7260","Lietinna"},
        {"7260","Lisle"},
        {"7260","Nabowla"},
        {"7260","North Scottsdale"},
        {"7260","Scottsdale"},
        {"7260","South Springfield"},
        {"7260","Springfield"},
        {"7260","Tonganah"},
        {"7260","Tulendeena"},
        {"7260","West Scottsdale"},
        {"7261","Branxholm"},
        {"7261","Warrentinna"},
        {"7262","Bridport"},
        {"7262","Tomahawk"},
        {"7262","Waterhouse"},
        {"7263","Alberton"},
        {"7263","Legerwood"},
        {"7263","Ringarooma"},
        {"7263","Talawa"},
        {"7263","Trenah"},
        {"7264","Boobyalla"},
        {"7264","Cape Portland"},
        {"7264","Derby"},
        {"7264","Eddystone"},
        {"7264","Eddystone Point"},
        {"7264","Gladstone"},
        {"7264","Herrick"},
        {"7264","Moorina"},
        {"7264","Musselroe Bay"},
        {"7264","Pioneer"},
        {"7264","Rushy Lagoon"},
        {"7264","South Mount Cameron"},
        {"7264","Telita"},
        {"7264","Weldborough"},
        {"7265","Banca"},
        {"7265","Winnaleah"},
        {"7267","Bangor"},
        {"7267","Karoola"},
        {"7267","Lalla"},
        {"7267","Lower Turners Marsh"},
        {"7267","Turners Marsh"},
        {"7268","Lilydale"},
        {"7268","North Lilydale"},
        {"7268","Underwood"},
        {"7270","Badger Head"},
        {"7270","Beaconsfield"},
        {"7270","Beauty Point"},
        {"7270","Clarence Point"},
        {"7270","Flowery Gully"},
        {"7270","Greens Beach"},
        {"7270","Ilfraville"},
        {"7270","Kayena"},
        {"7270","Kelso"},
        {"7270","Rowella"},
        {"7270","Sidmouth"},
        {"7270","York Town"},
        {"7275","Blackwall"},
        {"7275","Deviot"},
        {"7275","Exeter"},
        {"7275","Frankford"},
        {"7275","Glengarry"},
        {"7275","Holwell"},
        {"7275","Lanena"},
        {"7275","Loira"},
        {"7275","Notley Hills"},
        {"7275","Robigana"},
        {"7275","Swan Point"},
        {"7275","Winkleigh"},
        {"7276","Gravelly Beach"},
        {"7277","Bridgenorth"},
        {"7277","Grindelwald"},
        {"7277","Legana"},
        {"7277","Rosevears"},
        {"7290","Hadspen"},
        {"7291","Carrick"},
        {"7292","Hagley"},
        {"7292","Quamby Bend"},
        {"7292","Rosevale"},
        {"7292","Selbourne"},
        {"7292","Westwood"},
        {"7300","Devon Hills"},
        {"7300","Perth"},
        {"7300","Powranna"},
        {"7301","Bishopsbourne"},
        {"7301","Blackwood Creek"},
        {"7301","Liffey"},
        {"7301","Longford"},
        {"7301","Toiberry"},
        {"7302","Bracknell"},
        {"7302","Cressy"},
        {"7302","Poatina"},
        {"7303","Birralee"},
        {"7303","Cluan"},
        {"7303","Exton"},
        {"7303","Oaks"},
        {"7303","Osmaston"},
        {"7303","Westbury"},
        {"7303","Whitemore"},
        {"7304","Brandum"},
        {"7304","Breona"},
        {"7304","Caveside"},
        {"7304","Central Plateau"},
        {"7304","Chudleigh"},
        {"7304","Dairy Plains"},
        {"7304","Deloraine"},
        {"7304","Doctors Point"},
        {"7304","Dunorlan"},
        {"7304","Elizabeth Town"},
        {"7304","Golden Valley"},
        {"7304","Jackeys Marsh"},
        {"7304","Kimberley"},
        {"7304","Liena"},
        {"7304","Mayberry"},
        {"7304","Meander"},
        {"7304","Mersey Forest"},
        {"7304","Mole Creek"},
        {"7304","Moltema"},
        {"7304","Montana"},
        {"7304","Needles"},
        {"7304","Parkham"},
        {"7304","Quamby Brook"},
        {"7304","Red Hills"},
        {"7304","Reedy Marsh"},
        {"7304","Reynolds Neck"},
        {"7304","Weegena"},
        {"7304","Weetah"},
        {"7304","Western Creek"},
        {"7305","Merseylea"},
        {"7305","Railton"},
        {"7305","Sunnyside"},
        {"7306","Acacia Hills"},
        {"7306","Barrington"},
        {"7306","Beulah"},
        {"7306","Cethana"},
        {"7306","Claude Road"},
        {"7306","Cradle Mountain"},
        {"7306","Gowrie Park"},
        {"7306","Lorinna"},
        {"7306","Lower Barrington"},
        {"7306","Lower Beulah"},
        {"7306","Middlesex"},
        {"7306","Nook"},
        {"7306","Nowhere Else"},
        {"7306","Paradise"},
        {"7306","Promised Land"},
        {"7306","Roland"},
        {"7306","Sheffield"},
        {"7306","Staverton"},
        {"7306","Stoodley"},
        {"7306","West Kentish"},
        {"7307","Bakers Beach"},
        {"7307","Harford"},
        {"7307","Hawley Beach"},
        {"7307","Latrobe"},
        {"7307","Moriarty"},
        {"7307","Northdown"},
        {"7307","Port Sorell"},
        {"7307","Sassafras"},
        {"7307","Shearwater"},
        {"7307","Squeaking Point"},
        {"7307","Thirlstane"},
        {"7307","Wesley Vale"},
        {"7310","Aberdeen"},
        {"7310","Ambleside"},
        {"7310","Devonport"},
        {"7310","Don"},
        {"7310","East Devonport"},
        {"7310","Erriba"},
        {"7310","Eugenana"},
        {"7310","Forth"},
        {"7310","Forthside"},
        {"7310","Kindred"},
        {"7310","Lillico"},
        {"7310","Lower Wilmot"},
        {"7310","Melrose"},
        {"7310","Miandetta"},
        {"7310","Moina"},
        {"7310","Paloona"},
        {"7310","Quoiba"},
        {"7310","South Spreyton"},
        {"7310","Spreyton"},
        {"7310","Stony Rise"},
        {"7310","Tarleton"},
        {"7310","Tugrah"},
        {"7310","Wilmot"},
        {"7315","Abbotsham"},
        {"7315","Castra"},
        {"7315","Gawler"},
        {"7315","Gunns Plains"},
        {"7315","Leith"},
        {"7315","Loongana"},
        {"7315","Nietta"},
        {"7315","North Motton"},
        {"7315","Preston"},
        {"7315","South Nietta"},
        {"7315","South Preston"},
        {"7315","Spalford"},
        {"7315","Sprent"},
        {"7315","Turners Beach"},
        {"7315","Ulverstone"},
        {"7315","Upper Castra"},
        {"7315","West Ulverstone"},
        {"7316","Camena"},
        {"7316","Cuprona"},
        {"7316","Heybridge"},
        {"7316","Howth"},
        {"7316","Loyetea"},
        {"7316","Penguin"},
        {"7316","Preservation Bay"},
        {"7316","Riana"},
        {"7316","South Riana"},
        {"7316","Sulphur Creek"},
        {"7316","West Pine"},
        {"7320","Acton"},
        {"7320","Brooklyn"},
        {"7320","Burnie"},
        {"7320","Camdale"},
        {"7320","Cooee"},
        {"7320","Downlands"},
        {"7320","Emu Heights"},
        {"7320","Havenview"},
        {"7320","Hillcrest"},
        {"7320","Montello"},
        {"7320","Ocean Vista"},
        {"7320","Park Grove"},
        {"7320","Parklands"},
        {"7320","Romaine"},
        {"7320","Round Hill"},
        {"7320","Shorewell Park"},
        {"7320","South Burnie"},
        {"7320","Upper Burnie"},
        {"7320","Wivenhoe"},
        {"7321","Black River"},
        {"7321","Boat Harbour"},
        {"7321","Boat Harbour Beach"},
        {"7321","Chasm Creek"},
        {"7321","Corinna"},
        {"7321","Cowrie Point"},
        {"7321","Crayfish Creek"},
        {"7321","Detention"},
        {"7321","East Cam"},
        {"7321","East Ridgley"},
        {"7321","Edgcumbe Beach"},
        {"7321","Guildford"},
        {"7321","Hampshire"},
        {"7321","Hellyer"},
        {"7321","Highclere"},
        {"7321","Luina"},
        {"7321","Mawbanna"},
        {"7321","Montumana"},
        {"7321","Mooreville"},
        {"7321","Natone"},
        {"7321","Parrawe"},
        {"7321","Port Latta"},
        {"7321","Ridgley"},
        {"7321","Rocky Cape"},
        {"7321","Savage River"},
        {"7321","Sisters Beach"},
        {"7321","Stowport"},
        {"7321","Tewkesbury"},
        {"7321","Tullah"},
        {"7321","Upper Natone"},
        {"7321","Upper Stowport"},
        {"7321","Waratah"},
        {"7321","West Mooreville"},
        {"7321","West Ridgley"},
        {"7321","Wiltshire"},
        {"7322","Somerset"},
        {"7325","Calder"},
        {"7325","Doctors Rocks"},
        {"7325","Elliott"},
        {"7325","Flowerdale"},
        {"7325","Henrietta"},
        {"7325","Lapoinya"},
        {"7325","Meunna"},
        {"7325","Milabena"},
        {"7325","Moorleah"},
        {"7325","Mount Hicks"},
        {"7325","Myalla"},
        {"7325","Oldina"},
        {"7325","Oonah"},
        {"7325","Preolenna"},
        {"7325","Seabrook"},
        {"7325","Sisters Creek"},
        {"7325","Table Cape"},
        {"7325","Takone"},
        {"7325","West Takone"},
        {"7325","Wynyard"},
        {"7325","Yolla"},
        {"7330","Alcomie"},
        {"7330","Arthur River"},
        {"7330","Brittons Swamp"},
        {"7330","Broadmeadows"},
        {"7330","Christmas Hills"},
        {"7330","Couta Rocks"},
        {"7330","Edith Creek"},
        {"7330","Forest"},
        {"7330","Alcomie"},
        {"7330","Irishtown"},
        {"7330","Lileah"},
        {"7330","Marrawah"},
        {"7330","Mella"},
        {"7330","Mengha"},
        {"7330","Montagu"},
        {"7330","Nabageena"},
        {"7330","Nelson Bay"},
        {"7330","Redpa"},
        {"7330","Robbins Island"},
        {"7330","Roger River"},
        {"7330","Scopus"},
        {"7330","Scotchtown"},
        {"7330","Smithton"},
        {"7330","South Forest"},
        {"7330","Temma"},
        {"7330","Three Hummock Island"},
        {"7330","Togari"},
        {"7330","Trowutta"},
        {"7330","West Montagu"},
        {"7330","Woolnorth"},
        {"7331","Stanley"},
        {"7466","Gormanston"},
        {"7467","Lake Margaret"},
        {"7467","Queenstown"},
        {"7468","Macquarie Heads"},
        {"7468","Strahan"},
        {"7469","Granville Harbour"},
        {"7469","Renison Bell"},
        {"7469","Trial Harbour"},
        {"7469","Zeehan"},
        {"7470","Rosebery"}};

        
    // ----CONSTANTS----
    // Magic numbers
    public final int FIRST_POSTCODE = 7000; // Start of postcode range
    public final int LAST_POSTCODE = 7470;  // End of postcode range
    public final int POSTCODE = 0;          // Used to print the postcode number
    public final int SUBURB = 1;            // Used to print the suburb name
    
    // ANSI Colors
    public final String ANSI_RED = "\u001B[31m";  // Used to highlight error logs in red
    public final String ANSI_RESET = "\u001B[0m"; // Used to reset console output color

    // ----GLOBAL----
    private int firstCode; // User's first postcode for start-range
    private int lastCode;  // User's second postcode for end-range
    Boolean allSuburbs;    // Flag used printing all suburbs or just the first


    /*  
        --------------------------------------------------------------------------
        Prompts the user to enter a postcode range and displays the suburb/suburbs
        for each postcode in the specified range.
        #region Configure 
    */
    public void configure() {
        Scanner cin = new Scanner(System.in); // Scanner for reading console input
        Boolean isValidFirstCode = false;     // Flag used for checking valid user input (first postcode)
        Boolean isValidLastCode = false;      // Flag used for checking valid user input (last postcode)
        String choice;                        // User's menu choice

        // Prompt user to print every suburb (Y) or only the first suburb for each postcode in the specified range (N)
        System.out.println("\n       ----------Tasmanian PostCodes----------\n");
        System.out.print("Print every suburb for each selected postcode [Y/N] > ");
        choice = cin.nextLine(); // Get console input

        // Handle user's menu choice
        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
            allSuburbs = true; // Set flag to indicate all suburbs for each postcode should be printed
        }
        else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
            allSuburbs = false; // Set flag to indicate only the first suburb for each postcode should be printed
        }
        else {
            System.out.println("..." + ANSI_RED + "N " + ANSI_RESET + "assumed...");
            allSuburbs = false; // Set flag to indicate only the first suburb for each postcode should be printed by default
        }

        /*
            Keep prompting the user to enter the first postcode to print until valid start-range has 
            been given. If the user's first postcode is out of valid postcode range (0 - 793), default 
            to the closest postcode. Catch and handle invalid user input (non-integer).
        */
        do { 
            // Prompt user to enter the first postcode (start of postcode range)
            System.out.print("Enter the number of the first postcode to print > ");

            try { 
                firstCode = cin.nextInt(); // Get console input

                // Check if user's input falls in valid postcode range (793 unique postcodes)
                if (firstCode < FIRST_POSTCODE) {

                    // Set first code to 7000 by default if user's input is less then valid range
                    firstCode = FIRST_POSTCODE; 
                    System.out.println("..." + ANSI_RED + "7000 " + ANSI_RESET + "assumed...");
                }
                else if (firstCode > LAST_POSTCODE) {

                    // Set first code to 7470 by default if user's input is greater then valid range
                    firstCode = LAST_POSTCODE; 
                    System.out.println("..." + ANSI_RED + "7470 " + ANSI_RESET + "assumed...");
                }

                isValidFirstCode = true; // Exit user prompt
            }
            catch (InputMismatchException e) { // Catch invalid user input
                System.out.println("..." + ANSI_RED + "[Error] " + ANSI_RESET + "Invalid input, please try again");
                cin.nextLine(); // Clear invalid console input
            }
        } while (!isValidFirstCode); // Keep prompting user until valid response has been given
        
        /*
            Keep prompting the user to enter the last postcode to print until valid end-range has 
            been given. If the user's first postcode is out of valid postcode range (0 - 793), default 
            to the closest postcode. Catch and handle invalid user input (non-integer).
        */
        do { 
            // Prompt user to enter the last postcode (end of postcode range)
            System.out.print("Enter the number of the last postcode to print > ");

            try { 
                lastCode = cin.nextInt(); // Get console input
                
                // Check if user's input falls in valid postcode range (793 unique postcodes)
                if (lastCode > LAST_POSTCODE) {

                    // Set last code to 7470 by default if user's input is greater then valid range
                    lastCode = LAST_POSTCODE; 
                    System.out.println("..." + ANSI_RED + "7470 " + ANSI_RESET + "assumed...");
                }
                else if (lastCode < FIRST_POSTCODE) {

                    // Set first code to 7000 by default if user's input is less then valid range
                    lastCode = FIRST_POSTCODE; 
                    System.out.println("..." + ANSI_RED + "7000 " + ANSI_RESET + "assumed...");
                }
                
                isValidLastCode = true; // Exit user prompt
            }
            catch (InputMismatchException e) { // Catch invalid user input
                System.out.println("..." + ANSI_RED + "[Error] " + ANSI_RESET + "Invalid input, please try again");
                cin.nextLine(); // Clear invalid console input
            }
        } while (!isValidLastCode); // Keep prompting user until valid response has been given

        cin.close(); // Close console input scanner
    }


    /*  
        --------------------------------------------------------------------------
        Either prints the first suburb for each postcode or prints all suburbs for
        each postcode within the user's specified range.
        #region PrintTable 
    */
    public void printTable() {
        boolean beenPrinted; // Flag to track if the postcode has already been printed
        int postcode;        // Each unique postcode in array (793 unique postcodes)
        int i;               // Used to iterate through the user's specified postcode range
        int j;               // Used to iterate through each unique postcode in array (793 unqiue postcodes)
        
        System.out.println(); // Print space between user prompt and postcode table

        if (allSuburbs == false) {
            /*  
                ----DISPLAY FIRST SUBURB FOR EACH POSTCODE----
                Loops through the user's specified range as well as through the entire postcode array and only prints 
                the postcode if it has not already been printed. This which works by comparing each postcode in the user's 
                specified range to each postcode in the array which is indicated by the beenPrinted flag.
            */

            // Iterate through the user's specified postcode range
            for (i = firstCode; i <= lastCode; i++) {
                beenPrinted = false; // Reset the flag for each new postcode
                
                // Iterate through the entire postcode array (793 unique postcodes)
                for (j = 0; j < POSTCODES.length; j++) { 

                    // Convert postcode string into an int for correct comparison
                    postcode = Integer.parseInt(POSTCODES[j][POSTCODE]); 
                    
                    // Compare each unique postcode to all postcodes to ensure each postcode is not printed multiple times
                    if (postcode == i && beenPrinted == false) {

                        // Print each postcode and the first suburb for that postcode
                        System.out.print(POSTCODES[j][POSTCODE] + "\t"); // Postcode
                        System.out.println(POSTCODES[j][SUBURB]);        // First suburb

                        beenPrinted = true; // Flag to indicate the postcode has been printed
                    }
                }
            }
        }
        else {
            /*  
                ----DISPLAY ALL SUBURBS FOR EACH POSTCODE----
                Loops through the user's specified range as well as through the entire postcode array and only prints 
                the postcode if it has not already been printed. This which works by comparing each postcode in the user's 
                specified range to each postcode in the array which is indicated by the beenPrinted flag.
            */

            int charMax = 80; //maximum number of characters per line
            int charCount = 0; //number of characters printed

            for (i = firstCode; i <= lastCode; i++) { // Start to end of the user's specified range
                beenPrinted = false; // Reset the flag for each new postcode
                
                for (j = 0; j < POSTCODES.length; j++) { // 0 to 793
                    postcode = Integer.parseInt(POSTCODES[j][POSTCODE]); // Convert postcode string into an int

                    // Display the postcode only if it has not already
                    if (postcode == i && beenPrinted == false) {
                        System.out.print(POSTCODES[j][POSTCODE] + "\t"); // Print the postcode
                        beenPrinted = true; // Flag to indicate the postcode has been dispalyed
                        charCount = 0; // Reset charCount for each new postcode
                    }

                    // displays all Suburbs associated with postcode
                    // checks to see if 80 char have been printed yet
                    if (postcode == i && charCount <= charMax){
                        System.out.print(POSTCODES[j][SUBURB]); //prints suburb name
                        charCount = charCount + POSTCODES[j][1].length(); // string length is added to charCount
                        if (j < POSTCODES.length - 1 && POSTCODES[j][POSTCODE].equals(POSTCODES[j + 1][POSTCODE])) {
                            System.out.print(", ");
                            charCount = charCount + 2;
                        } 
                        else {
                            System.out.println();
                        }
                    }
                    else if (postcode == i && charCount >= charMax) {
                        System.out.println(); 
                        System.out.print("\t"); // Indents suburbs
                        charCount = 0;
                        System.out.print(POSTCODES[j][SUBURB]); //prints suburb name
                        charCount = charCount + POSTCODES[j][SUBURB].length();
                        if (j < POSTCODES.length - 1 && POSTCODES[j][POSTCODE].equals(POSTCODES[j + 1][POSTCODE])) {
                            System.out.print(", ");
                            charCount = charCount + 2;
                        } 
                        else {
                            System.out.println();
                        }
                    }
        }
        
    }
}
