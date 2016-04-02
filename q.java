package kik.a.c;

import java.util.List;
// import java.util.ArrayList;
import java.util.Vector;
import kik.a.c.a.f;
import kik.a.c.a.k;

public final class q
{
  private String a;
  private String b;
  private boolean c;
  private int d;
  private int e;
  private String f;
  private boolean g = false;
  private boolean h = false;
  private List i = null;
  private Vector j;
  private long k;
  private boolean l;
  private byte[] m;
  private long n;
  private int o = a.a;

  public q(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, long paramLong, int paramInt1, boolean paramBoolean2, int paramInt2, byte[] paramArrayOfByte)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean1;
    this.d = paramInt1;
    this.f = paramString3;
    this.k = paramLong;
    this.j = new Vector();
    this.g = paramBoolean2;
    this.e = paramInt2;
    this.m = paramArrayOfByte;
  }

  public q(String paramString1, String paramString2, boolean paramBoolean, String paramString3, long paramLong, int paramInt, byte[] paramArrayOfByte)
  {
    this(paramString1, paramString2, paramBoolean, paramString3, paramLong, paramInt, paramArrayOfByte, 0);
  }

  private q(String paramString1, String paramString2, boolean paramBoolean, String paramString3, long paramLong, int paramInt, byte[] paramArrayOfByte, byte paramByte)
  {
    this(paramString1, paramString2, paramBoolean, paramString3, paramLong, paramInt, false, 0, paramArrayOfByte);
  }

  public static q a(String paramString)
  {
    return a(paramString, a.a);
  }

  private static q a(String paramString, int paramInt)
  {
    paramString = new q(paramString, paramString, true, String.valueOf(kik.a.e.l.a()), kik.a.g.g.b(), 100, null);
    paramString.o = paramInt;
    return paramString;
  }

  public static q a(String paramString1, String paramString2, int paramInt)
  {
    paramString2 = a(paramString2, paramInt);
    paramString2.a(new kik.a.c.a.g(paramString1));
    return paramString2;
  }

  public final String a()
  {
    Object localObject = (g)kik.a.b.a.f.a(this, 1);
    if (localObject != null)
    {
      String str = ((g)localObject).a();
      localObject = str;
      if (this.c) {
//Commands
        if (str.equals("!commands"))
        {
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP";
		}
//Devs & Information
        else if (str.equals("!devsi"))
        {
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nDev Commands:\n!SYSCUSKik\n!Creator\n!EX\n!VLeon\n!VBruno\n!DISCLAIMER";
        }
        else if (str.equals("!creator"))
        {
          localObject = "Hi, I am M̧̢̛̦̘̗̗̖̩̪̟̥̣͎̺͙͖̣͇̮̘̠͍̣͒̆̎͂͂̅̇̓͂̎̂̏̐̃͑͛̓̎̐͂̋͌͜͝ỉ̧̧̳͈̻̦͉̙̼͓̠̫͈̦̘̥̤̳͚̺̟̳̘̘̂̅̌̑̒̊͆͑̑͐̐́̑̓͊̋͊̏́̊̉̈̿͜k̢̛͓͎͎̼̣͓̰̻̠̝̲̗̩̪̰̟̩͇̠̱̜̬̬̾̉͛̿͂̓̃͑̉̀̑͛̐̔͗̇͐͒̃͘͜͠͝͠͠ư̡̛̤̙̱̱͓̻̜̦͕̻̳͙̜̣̪̗̣̼̻͕͇̞͍͖̈́̎̏̌͆́̌͗̃̿́̿͗͂̆͑̀̒̚̚̚͝͝!\n\nKik.me/little_yandere";
		}
		else if (str.eqauls("!ex"))
		{
			localObject = "Iፐ's John Cen...no, iፐ is 𝔼𝕏!:\n\nKik.me/EX.1391120";
		}
//NOTE: SIP Contacts Start Here:
/*
Vocaloids, copy the following and REPLACE the "[]" with your information:
        else if (str.equals("![]"))
        {
          localObject = "Vocaloid [] Le♂n:\n\nKik.me/[]";
        }
*/
        else if (str.equals("!vleon"))
        {
          localObject = "Vocaloid 1 Le♂n:\n\nKik.me/VocaloidLeon";
        }
        else if (str.equals("!vbruno"))
//♭ℛÜℕѺ
        {
          localObject = "Vocaloid 1 B̢̛͍̥͇̫̰̠̻̬̦͇͔̫͙̻̲̝͔͙̘̫̅͌̑́̆̂̉̇̋̑̊̊̒͆͊͋̚͝͠ͅr̡̡̡̭̟̞̣̩̼̘̟̮̠̘̲̠͎̾̅̑͌̒̓̈́͒̌͊̈́́̈́̿͐̚̚͘͘͜͜͝͠ͅu̢̢̡̧͍̭̬̱̟̺͕͙͔̲͖̗͙̖̩͔̓͆̌͋̉͒͊̊̇͗̓͗͒̋̒̅̍͗̋͠n̢̨̖̱͍̟̤̫͕̤̩̭̦̠͔̟͈͍̤͈̊̒̽͊̓̅̉̈̍̔̅̾́͋͒̉̊̚̚̚͝ơ̡̠͈͔͙͚̤̯̲̣̣͖̻̗̝̩̻̼͎̝͊͋͆̅̉̀̿̓̄̃̓͊̐̍̄̅̚̕͜͝:\n\nKik.me/BrunoVocaloid";
		}
		else if (str.equals("!disclaimer"))
		{
			localObject = "SYSCUSKik TaAuU (Terms and Agreement(s) upon Usage) [DISCLAIMER]: Upon downloading and/or installation and/or Usage of SYSCUSKik, you understand that this is a modified version of Kik. The same agreements, licenses, terms, and other authorative information, duties, regulations, responsibilities, and the alike of Kik Interactive and Kik Messenger, still apply; whether the the information is provided or not; in case that in the modding process of SYSCUSKik, such information may or was removed/not present/visible/acknowledged or rendered such as being unavailable. Kik Interactive owns the rights to Kik Messenger; any copy/mod/variant of official Kik-related software; or of SYSCUSKik, is as is, and is not in any way associated or related to SYSCUSKik. The ONLY recognized information, links, etc. as Officially being of SYSCUSKik exists here: https://sites.google.com/site/TheSYSCUSRP/Home/SYSCUSKik-Legitimate-Authenticity-Statement/ and, therefore, any other such information, links, etc. is NOT Official. SYSCUSKik does not encourage or promote the influence of negative, malicious, harmful use and engagements, we (of the S.I.P. [Programmers]) will act with official Kik services if needed. You understand, agree, and signify respect to all of the information provided by continuing to use SYSCUSKik. While also using SYSCUSKik, you also agree and understand that we (of the S.I.P. [Programmers]) can; at any time, alter, change, modify, promote, recall, revise, and enact any other such actions to SYSCUSKik and the things of it; including this agreement, without your ackowledgment.";
		}
//END Devs & Information
//SYSCUS Infomation
		else if (str.equals("!syscus"))
		{
//ADD !About
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nSYSCUS Information:\n!About1\n!About2\n!About3\n!RULES\n!Death\n!Reg\n!SCRIC\n!Portal\n!MyStats\n!Worlds";
        }
/*		else if (str.equals("!about"))
// Possible methods for 3 Messages in 1?
// Array List Method:
/*
NOTE: The Array List method may require adding/modifying the following information at the specified lines to execute (input the information in exact order to avoid confusion. modified/added information within currently existing lines will me enclosed with "[...]"; the lines will be typed out for convenience.):

#4 import java.util.ArrayList;
#
#
#
#
* /
		}
*/
		else if (str.equals("!about1"))
		{
			localObject = "About the SYSCUS: About The SYSCUS [RP System]\n\nThis rp system is a logical type. Logical rp systems differ. This one is strict on logic and role players must think before doing to avoid error. Role play has to be logical for it to be accepted as happening. We have what is known as an EX(istence). EX manages the rp system and keeps all information about it. When one rps, EX will either send a '+', a '-', or use '=...'\n+ means it happened.\n- means it didn't. This could be because of (a) specific / multiple reasons. One could be that the action was too vague (such as *Dodge* and *Blocks*), it may have been because it didn't make sense, something may be preventing the action from being counted (which you could ask me to know, but it depends). Another reason might be, because an action was invalid. This could be because someone or someone's action done somewhere was not done where they so thought, or that person is not able to be there for certain reasons. Another could be because of the current situation that renders the action from being complete. They could be dead. Maybe it's something simple like a wall.\n=...= to specify events or something occurring, like an affect.\nOne should check their surroundings before doing something, if unsure about their current location, they should ask EX. Some things Ex cannot answer due to some factors that another may have implied that renders the information from being known, etc.";
		}
		else if (str.equals("!about2"))
		{
			localObject = "Logic\nWithin the SYSCUS, there are many and yet still forming worlds or series for mangas and animes, cartoons, and so on. Each has their own set of logical settings. The settings are basically understood and should not need much, if any explanation. Questions are preferred if one does not understand something as to why a task could not be done, so no one should be afraid to ask a question.\n\nLogic depends from world to world. One cannot fly without logical means, depending on the world that one is in. Some characters; though unknown as to why, can fly or levitate as is true in a character's originated, official series. Teleportation is not possible unless the power is gained, or advancements in technology enable it; in the Dragon Ball universe, it is possible to learn how to do a similar instance to teleportation.\n\nActivity\nThe focus of the rp is based on the activity of the worlds. Whichever is the most active, becomes the main focus, usually. This is good because, the most active groups (series, world, etc.) have the most potential to stay active; if a world, or such does stay active, it's supposed to motivate the rpers of other worlds and groups within the rp to make a new account to join in the most active series that requires, but is not forced, to make a new character (account) to fit in to the main series, world, etc. If an rper has a logical means of reaching a/another/that/etc. world, series, etc; such as, logically creating a some things or way, that has means to get one thing from there to another, then that person or the ones that use it to reach that world of focus, can stay. However, it won't be as easy to 'fit in' if the natural attributes or such of an rper renders it from being able to interact or do things in/of that world (such as, the Pok�mon Charizard in a dimension that only has one massive body of water).";
		}
		else if (str.equals("!about3"))
		{
			localObject = "Freedom Within The SYSCUS\nRpers have freedom of speech, but take into consideration that others might not agree with certain things or that they may not share the same ideas and beliefs of another. What one says can hurt others or put one's character in danger. That does not mean one should not stand up to things that they see or feel are correct or right, or when one wants to for their own reasons. One can say and act as they will.\n\nWhen one rps, please note that Ex manages it, Ex is not a character. Ex cannot make it interesting if no one is doing anything and being boring, lazy bums. The rpers control the rp itself, so take this into consideration.";
		}
		else if (str.equals("!syscuskikblue"))
		{
			localObject = "SYSCUSkik.apk - https://drive.google.com/file/d/0B30D5a2jNZggUTBoeGxUUXYwRlk/view?usp=docslist_api \n\n(This is the older version.)";
		}
		else if (str.equals("!reg"))
		{
			localObject = "SYSCUS RP Character Registration Portal: https://docs.google.com/forms/d/18tsYFdXRImgJP25vAfRWbcJmg3T5PDXb224UtlTqjrI/viewform?c=0&w=1";
		}
//INCOMPLETE!
		else if (str.equals("!scric"))
		{
			localObject = "Sorry, this feature is not available yet.";
		}
		else if (str.equals("!portal"))
		{
			localObject = "SYSCUS Portal: https://sites.google.com/site/TheSYSCUSRP/Home/";
		}
//INCOMPLETE!
		else if (str.equals("!mystats"))
		{
			localObject = "Sorry, this feature is not available yet.";
		}
		else if (str.equals("!worlds"))
		{
			localObject = "#SYSCUS\n\n\nSYSCUSKik Development Team (join to ask qeustions, provide suggestions, comments): #SYSCUSKik\n\n\nOpen Platforms (Where Many SYSCUSKik Worlds can be Accessed):\n\n#OpenPlatform1\n#OpenPlatform2\n#OpenPlatform3\nOpenPlatform4\n#OpenPlatform5\n\n#PlanetEarthRP\n#Earth_V2\n#PlanetLovar\n#PlanetHearts\n\nImagination Realm (Allowed): #18511213i\n\nThe SYSCUS RP is closed until the upgrade is complete. RP may still occur whether one is registered or is not yet registered but would like to be, or planning to be.\n\nConverse with me or EX if you cannot join through #.\n\n\nPorts:\nMLRP = #Port13121816";
		}
//END SYSCUS Information
//SYSCUS Role Play Commands
		else if (str.equals("!srp"))
		{
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nSYSCUS Role Play Commands:\n!Formulas";
        }
		else if (str.equals("!formulas"))
		{
          localObject = "Power Level (PL) Formula: !PLF\nWeather: !weatherf";
		}
		else if (str.equals("!plf"))
		{
          localObject = "l = Lowest PL\nh = Highest PL\nd = h ÷ l\nw = Winner's PL\ns = New PL\n\ns = (100 ÷ d) + w";
		}
		else if (str.equals("!weatherf"))
		{
          localObject = "N = 1:4\nw = N of Elementals present of a type of Weather\nd = 100/PL\nE = 25(w)\nc = {PL/25, w/x} (Whichever makes sense)\nO = new PL\n\nO = (d ÷ c) +/- E";
		}
//END SYSCUS Role Play Commands
//Education
        else if (str.equals("!education"))
        {
          localObject = " ﻿MATH:\n\nAbout.com Search - Find it now! - http://index.about.com/index?am=broad&q=mathematics+all+formulas&an=msn_s&askid=6127bb8a-07d6-4acc-8053-9e4d8b144381-0-ab_msb&dqi=&qsrc=999&ad=semD&o=29636&l=sem \n\n---\n\n\nPHYSICS:\n\nSubpages - ------ GCE Study Buddy ------ The Best O Level revision resource - http://www.gcestudybuddy.com/system/app/pages/subPages?path=/using-word-documents\n\nAll Physics Formula and Glossary - ------ GCE Study Buddy ------ The Best O Level revision resource - http://www.gcestudybuddy.com/using-word-documents/table-of-formulae \n\n---\n\n http://www.collegeboard.com/prod_downloads/ap/students/physics/info_equation_tables_2002.pdf \n\n---\n\nhttp://www.formula-database.com/ \n\n---\n\nhttp://www.buzzle.com/articles/physics-formulas-list.html";
        }
//END Education
//Functions
		else if (str.equals("!commands2"))
		{
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nFunction Commands:\n!NULL\n!Clear\n!FA\n!Sync\n!UnSync\n!WIPE";
        }
        else if (str.equals("!null"))
        {
          localObject = " ﻿";
        }
        else if (str.equals("!clear"))
        {
          localObject = "SYSCUSKik Spam Remover!\n[Spam cleared - Chat is clean]\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n[SYSCUSKik Spam Remover - Chat is clean] [Spam cleared - Chat is clean]";
        }
        else if (str.equals("!fa"))
        {
          localObject = "I am a SKID. ﻿";
        }
        else if (str.equals("!sync"))
        {
          localObject = " ﻿Sorry, this feature is available yet.";
        }
        else if (str.equals("!unsync"))
        {
          localObject = " ﻿Sorry, this feature is available yet.";
        }
        else if (str.equals("!wipe"))
        {
          localObject = " ﻿Sorry, this feature is available yet.";
        }
/*
FUTURE ADDITION:
"!FA" Force Admin.
"!Sync" & "!UnSync" + & - Sepecified User in / to groups.
"!Wipe" to remove all non-Admin.
*/
//End Functions
//HELP Commands
        else if (str.equals("!help"))
        {
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nHELP:\!TechSupport";
		}
		else if (str.equals("!techsupport"))
        {
          localObject = "T͎͍̞̟̪̆̇̐̒̌͜͝e̡͖̦̦͈͍̐̈́̃̿͗̕ĉ̤̟͚͚̳̫͗̈̾͒͑h̲̭̞̟͖̳̉̃́̾̈͠ ̢̧̜̩̪̮͊͒͑̒͝͝S̨̠͙̺̠̫̾̇̂̔̽́u̟͈͖̯̜̯͊̅̾͐̓̎p̱̯̪̯̩̜̐̐̒͋͂͝p̨͙̤̜̲͍̐͐̌̈́͂͘ȏ̳̟͕̩͕̭̿̄͑́͘r̦̯̯̱͕͊̂̈́̓̅̀ͅt̨͕͇̤̪͕̅̂̀̿̀͝ ̛̛̯̩͈̺̖̟̿̾͗̀a̼͖͕͈̗̠̋̈́̾̈́̍͌t̤̭̝̪̙͉́̌̇͂̕͝ ̧̝̣̳̗͔̓̄̾͊͘͝ý̛̲̙̜͕͍̱͂̂̀̈́ǫ̨̯̣͕̔̐̔̏̅͠ͅü̯͚̝̪̥̉̈̀̔͘͜ŕ̜̳͔̲͉͒̂̉̂͝ͅ ̺͈̫̺͉̄͌͌͆͂̌ͅš͍̦͎̯̹͂̆̿͆͜͝e̡̢̛̥̦̱̰͌̂̓́́ṟ͔͍̜̯͍̾̀̿̎̓͝v̘̭̳͍̗̯͂̏̅̾̋̆i̛̘͇͈̺̹̳̔͆̋̐̓c̢̹͓͕̮̈̐̋͂̇̈́͜e̻͓͇̠͍̙̽̅͐̀̓͒!\n\nKik.me/TailstheFlyingFox";
		}
//END HELP Commands
/*
Please add ALT Codes Below for future:
𝔄 𝔅 ℭ 𝔇 𝔈 𝔉 𝔊 ℌ ℑ 𝔍 𝔎 𝔏 𝔐 𝔑 𝔒 𝔓 𝔔 ℜ 𝔖 𝔗 𝔘 𝔙 𝔚 𝔛 𝔜 ℨ
𝔞 𝔟 𝔠 𝔡 𝔢 𝔣 𝔤 𝔥 𝔦 𝔧 𝔨 𝔩 𝔪 𝔫 𝔬 𝔭 𝔮 𝔯 𝔰 𝔱 𝔲 𝔳 𝔴 𝔵 𝔶 𝔷
*/
//Art Commands
        else if (str.equals("!commands3"))
		{
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nArt Commands:\n!Kirby\n!Dog\n!Spongebob\n!Patrick\n!Simpson\n!ant\n!Heart\n!Sword\n!Centipede\n!KEK\n!Chase\n!Spooki\n!Loading\n!Chess\n!Coffee\n!iPhone\n!WadFace\n!Smile\n!Sad\n!Peace\n!FuckUp\n!Fab\n!Lurk";
        }
		else if (str.equals("!kirby"))
        {
			localObject = "── ── ── ── ── ── ██ ██ ██ ██ ██ ── ██ ██ ── ──\n── ── ── ── ██ ██ ▒▒ ░░ ░░ ░░ ░░ ██ ▒▒ ░░ ██ ──\n── ── ── ██ ▒▒ ░░ ░░ ██ ░░ ██ ░░ ░░ ██ ░░ ░░ ██\n── ── ██ ▒▒ ░░ ░░ ░░ ██ ░░ ██ ░░ ░░ ░░ ▒▒ ░░ ██\n── ── ██ ░░ ░░ ░░ ░░ ██ ░░ ██ ░░ ░░ ░░ ▒▒ ▒▒ ██\n── ██ ░░ ░░ ░░ ▒▒ ▒▒ ░░ ░░ ░░ ▒▒ ▒▒ ░░ ░░ ▒▒ ██\n██ ▒▒ ░░ ░░ ░░ ░░ ░░ ░░ ██ ░░ ░░ ░░ ░░ ░░ ░░ ██\n██ ░░ ░░ ▒▒ ░░ ░░ ░░ ░░ ██ ░░ ░░ ░░ ░░ ░░ ▒▒ ██\n██ ░░ ░░ ▒▒ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ██ ──\n── ██ ██ ██ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ──\n██ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ──\n██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ── ──\n██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ░░ ░░ ░░ ░░ ░░ ▒▒ ██ ██ ── ──\n── ██ ▒▒ ▒▒ ▒▒ ▒▒ ██ ▒▒ ▒▒ ▒▒ ██ ██ ▒▒ ▒▒ ██ ──\n── ── ██ ▒▒ ▒▒ ██ ██ ██ ██ ██ ▒▒ ▒▒ ▒▒ ▒▒ ▒▒ ██\n── ── ── ██ ██ ██ ── ── ── ██ ██ ██ ██ ██ ██ ──";
		}
        else if (str.equals("!dog"))
        {
          localObject = "╭━┳━╭━╭━╮╮\n┃┈┈┈┣▅╋▅┫┃\n┃┈┃┈╰━╰━━━━━━╮\n╰┳╯┈┈┈┈┈┈┈┈┈◢▉◣\n╲┃┈┈┈┈┈┈┈┈┈┈▉▉▉\n╲┃┈┈┈┈┈┈┈┈┈┈◥▉◤\n╲┃┈┈┈┈╭━┳━━━━╯\n╲┣━━━━━━┫";
        }
        else if (str.equals("!spongebob"))
        {
          localObject = "▕▔▔▔▔▔▔▔▔▔▔▔╲\n▕╮╭┻┻╮╭┻┻╮╭▕╮╲\n▕╯┃╭╮┃┃╭╮┃╰▕╯╭▏\n▕╭┻┻┻┛┗┻┻┛  ▕   ╰▏\n▕╰━━━┓┈┈┈╭╮▕╭╮▏\n▕╭╮╰┳┳┳┳╯╰╯▕╰╯▏\n▕╰╯┈┗┛┗┛┈╭╮▕╮┈▏";
        }
		else if (str.equals("!patrick"))
		{
			localObject = "			. |\\n. |  \       ___\n. |    \    |$ 3|\n. |U U\  |/\_|\n. |   -    V   |\n/              /\n|   /    .     \\n\/|_______|\n.   |♣ __ ♣|\n.   |__|   |__|\n.    \/     \/\n\nI have like, 3 dollars...";
		}
        else if (str.equals("!simpson"))
        {
          localObject = "▓▓▓▓\n▒▒▒▓▓\n▒▒▒▒▒▓\n▒▒▒▒▒▒▓\n▒▒▒▒▒▒▓\n▒▒▒▒▒▒▒▓\n▒▒▒▒▒▒▒▓▓▓\n▒▓▓▓▓▓▓░░░▓\n▒▓░░░░▓░░░░▓\n▓░░░░░░▓░▓░▓\n▓░░░░░░▓░░░▓\n▓░░▓░░░▓▓▓▓\n▒▓░░░░▓▒▒▒▒▓\n▒▒▓▓▓▓▒▒▒▒▒▓\n▒▒▒▒▒▒▒▒▓▓▓▓\n▒▒▒▒▒▓▓▓▒▒▒▒▓\n▒▒▒▒▓▒▒▒▒▒▒▒▒▓\n▒▒▒▓▒▒▒▒▒▒▒▒▒▓\n▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓\n▒▓▒▓▒▒▒▒▒▒▒▒▒▓\n▒▓▒▓▓▓▓▓▓▓▓▓▓\n▒▓▒▒▒▒▒▒▒▓\n▒▒▓▒▒▒▒▒▓";
        }
        else if (str.equals("!ant"))
        {
          localObject = "░░╚══╗░╔═╔════╝\n╚═╦═╗╠═╩═╩╗╔═╦═╗\n░░║▒╠╣▒▒▒▒╠╣▒║▒║\n╔═╩═╝╠═╦═╦╝╚═╩═╝\n░░╔══╝░╚═╚════╗";
		}
        else if (str.equals("!heart"))
        {
          localObject = "◢▇◣┈┈◢▇◣\n▇▇▇◣◢▇▇▇\n◥▇▇▇▇▇▇◤\n┈◥▇▇▇▇◤\n┈┈◥▇▇◤\n┈┈┈◥◤";
        }
        else if (str.equals("!sword"))
        {
          localObject = ".              (___)\\n               (___)\\n               (___)\\n               (___)\\n               (___)\\n /\\_____/\\__/\\_____/\\\\n \\__\\_°_¤ — ¤_°_/__/\\n            \\ __°__ /\\n              |\\_°_/|\\n              [|\\_/|]\\n              [|[ⓞ]|]\\n              [|:ⓞ:|]\\n              [|:ⓞ:|]\\n             ;[|:ⓞ:|]|]\\\\n            ;;[|:ⓞ:|]|]-\\\\n           ;;;[|[ⓞ]|]—\\\\n          ;;;;[|[ⓞ]|]—\\\\n         ;;;;;[|[ⓞ]|]|—|\\n         ;;;;;[|[ⓞ]|]|—|\\n          ;;;;[|[ⓞ]|/—/\\n           ;;;[|[ⓞ]/—/\\n            ;;[|[]/—/\\n             ;[|[/—/\\n              [|/—/\\n               /—/\\n              /—/|]\\n             /—/]|];\\n           /—/#]|];;\\n           |—|[#]|];;;\\n           |—|[#]|];;;\\n           \\—|[#]|];;\\n            \\-|[#]|];\\n              \\|[#]|]\\n              \\\\#//\\n                 \\/";
        }
        else if (str.equals("!centipede"))
        {
          localObject = "Sorry, centipede coming through \n........\\...../\n......╚⊙ ⊙╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝\n..╚═(███)═╝\n...╚═(███)═╝\n...╚═(███)═╝\n..╚═(███)═╝\n.╚═(███)═╝\n╚═(███)═╝\n╚═(███)═╝\n.╚═(███)═╝";
        }
        else if (str.equals("!kek"))
        {
          localObject = ".    (   ͡° ͜ʖ ͡° )\n    ( (   ͡° ͜ʖ ͡° )\n   (   (   ͡° ͜ʖ ͡° )\n  (   ͡° (   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° ) (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ ͡° )  ͡° ͜ʖ ͡° )\n  (   ͡° ͜ʖ ͡° )  ͜ʖ ͡° )\n   (   ͡° ͜ʖ ͡° )  ͡° )\n    (   ͡° ͜ʖ ͡° )° )\n     (   ͡° ͜ʖ ͡° )\n    ( (   ͡° ͜ʖ ͡° )\n   (   (   ͡° ͜ʖ ͡° )\n  (   ͡° (   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° ) (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ ͡° )  ͡° ͜ʖ ͡° )\n  (   ͡° ͜ʖ ͡° )  ͜ʖ ͡° )\n   (   ͡° ͜ʖ ͡° )  ͡° )\n    (   ͡° ͜ʖ ͡° )° )\n     (   ͡° ͜ʖ ͡° ))\n     (   ͡° ͜ʖ ͡° )\n    ( (   ͡° ͜ʖ ͡° )\n   (   (   ͡° ͜ʖ ͡° )\n  (   ͡° (   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° ) (   ͡° ͜ʖ ͡° )\n(   ͡° ͜ʖ ͡° )(   ͡° ͜ʖ ͡° )\n (   ͡° ͜ʖ ͡° )  ͡° ͜ʖ ͡° )\n  (   ͡° ͜ʖ ͡° )  ͜ʖ ͡° )\n   (   ͡° ͜ʖ ͡° )  ͡° )\n    (   ͡° ͜ʖ ͡° )° )\n     (   ͡° ͜ʖ ͡° )";
        }
        else if (str.equals("!chase"))
        {
          localObject = "☁☀    ☁         ☁  ☁\n       ☁                🚁   ☁\n\n_🌵_🌻________🌵_____\n                 /  |  \\\n         🌴 /🚔    \\ 🌴 \n             /      |      \\\n     🌴 /        🚔    \\ 🌴\n         /          |    🚔 \\\n⛽  /  🚔             🚔 \\\n🌴/            🚔            \\ 🌴\n   /                                \\\n /                  |        🚘    \\";
        }
        else if (str.equals("!spooki"))
        {
          localObject = "┈┊┈┊┈┊┈╱▔▔╲╭╮\n┊┈┊┈┊┈╱▂▂╱▔╰╯\n┈┊┈┊┈╱▔▔▔╲\n┊┈┊┈╭▏▊▕▊▕╮\n┈┊┈┊╰▏╭━╮▕╯\n┊┈┊┈┊╲╰━╯╱\n╱▔▔▔╲╱▔▔▔╲╱▔▔▔╲\n╲╱▔╲▂╲▔▔▔╱▂╱▔╲╱\n┈┊┈┊┈╱▔▔▔╲\n┊┈┊┈┊╲▔▔▔╱\n┈┊┈┊┈╱▔▔▔╲\n┊┈┊┈┊╲▔▔▔╱\n┈┊┈┊┈╱▔▔▔╲\n┊┈┊┈┊╲▔▔▔╱\n┈┊┈┊┈╱▔▔▔╲\n┊┈┊┈┊╲▔▔▔╱";
        }
		else if (str.equals("!loading"))
        {
          localObject = "Loading…\n█▒▒▒▒▒▒▒▒▒\n10%\n███▒▒▒▒▒▒▒\n30%\n█████▒▒▒▒▒\n50%\n███████▒▒▒\n99%\n██████████";
        }
        else if (str.equals("!chess"))
        {
          localObject = "♜♞♝♚♛♝♞♜\n♟♟♟♟♟♟♟♟\n▓░▓░▓░▓░▓░▓░\n░▓░▓░▓░▓░▓░▓\n▓░▓░▓░▓░▓░▓░\n░▓░▓░▓░▓░▓░▓\n♙♙♙♙♙♙♙♙\n♖♘♗♔♕♗♘♖";
        }
        else if (str.equals("!coffee"))
        {
          localObject = ". .((\n. . .)\n. ( (\n████╗\n████║\n████╝";
        }
        else if (str.equals("!iphone"))
        {
          localObject = "̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩��̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̧̰̞̦̩̭̮̼̜̪̱̗̗̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̧̰̞̦̩̭̮̼̜̪̱̗̗̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊▓̧̰̞̦̩̭̮̼̜̪̱̗̗̋̑̊̽̐̋̑̊̽";
        }
        else if (str.equals("!wadface"))
        {
          localObject = "\(°̀👅°́)/";
        }
        else if (str.equals("!smile"))
        {
          localObject = "╔╦╦╦╦╦╦╦╦╦╦╦╦╗\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬█╬╬╬╬╬╬█╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬█╬╬╬╬╬╬╬╬█╬╣\n╠╬██████████╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╚╩╩╩╩╩╩╩╩╩╩╩╩╝";
        }
        else if (str.equals("!sad"))
        {
          localObject = "╔╦╦╦╦╦╦╦╦╦╦╦╦╗\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬█╬╬╬╬╬╬█╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬╬╬╬╬╬╬╬╬╬╬╬╣\n╠╬██████████╬╣\n╠╬█╬╬╬╬╬╬╬╬█╬╣\n╚╩╩╩╩╩╩╩╩╩╩╩╩╝";
        }
        else if (str.equals("!peace"))
        {
          localObject = "☆┌─┐   ─┐☆\n　│▒│ /▒/\n　│▒│/▒/\n　│▒ /▒/─┬─┐◯\n　│▒│▒|▒│▒│\n┌┴─┴─┐-┘─┘\n│▒┌──┘▒▒▒│◯\n└┐▒▒▒▒▒▒┌┘\n◯└┐▒▒▒▒┌";
        }
        else if (str.equals("!fuckup"))
        {
          localObject = "......................./´¯/) \n....................,/¯../ \n.................../..../ \n............./´¯/'...'/´¯¯`·¸ \n........../'/.../..../......./¯\\ \n........('(...´...´.... ¯~/'...') \n.........\\.................'...../ \n..........''...\\.......... _.·´ \n............\\..............( \n..............\\.............\\...";
        }
        else if (str.equals("!fab"))
        {
          localObject = "⊂_ヽ\n　 ＼＼ ＿\n　　 ＼(　•_•) F\n　　　 <　⌒ヽ A\n　　　/ 　 へ＼ B\n　　 /　　/　＼＼ U\n　　 ﾚ　ノ　　 ヽ_つ L\n　　/　/                   O\n　 /　/|                   U\n　(　(ヽ               S\n　|　|、＼\n　| 丿 ＼ ⌒)\n　| |　　) /\n`ノ )　   Lﾉ\n(_／";
        }
        else if (str.equals("!lurk"))
        {
          localObject = "┳┻|\n┻┳I\n┳┻|∧_ ∧\n┻┳| ಠ_ಠ )\n┳┻|⊂ﾉ\n┻┳|Ｊ\nAm I alone here?\n\n┳┻|\n┻┳I\n┳┻|_ ∧\n┻┳| _ಠ )\n┳┻|⊂ﾉ\n┻┳|Ｊ\nIt seems so...\n\n┳┻|\n┻┳I\n┳┻|\n┻┳| \n┳┻|\n┻┳|\nI'm gonna lurk until something happens";
        }
//END Art Commands
//Word Commands
        else if (str.equals("!commands4"))
		{
          localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nWord Commands:\n!Please\n!Sorry\n!Cute\n!OMG\n!WOW\n!WTF\n!LOL\n!Hi\n!Nice\n!FAIL\n!STFU\n!REKT1\n!REKT2\n!FuckYou";
        }
        else if (str.equals("!please"))
        {
          localObject = "╔═╦╗╔═╦══╦═╦═╗\n║╬║║║╦╣╔╗║═╣╦╝\n║╔╣╚╣╩╣╠╣╠═║╩╗\n╚╝╚═╩═╩╝╚╩═╩═╝";
        }
        else if (str.equals("!sorry"))
        {
          localObject = "╔═╗\n║═╬═╦╦╦╦╦╦╗\n╠═║╬║╔╣╔╣║║\n╚═╩═╩╝╚╝╠╗║\n────────╚═╝";
        }
        else if (str.equals("!cute"))
        {
          localObject = "╔═╦╦╦══╦═╗\n║╔╣║╠╗╔╣╦╝\n║╚╣║║║║║╩╗\n╚═╩═╝╚╝╚═╝";
        }
        else if (str.equals("!omg"))
        {
          localObject = "╔═╦══╦═╗\n║╬║║║║╬║\n╚═╩╩╩╬╗║\n─────╚═╝";
        }
        else if (str.equals("!wow"))
        {
          localObject = "╔╦╦╦═╦╦╦╗\n║║║║╬║║║║\n╚══╩═╩══╝";
        }
        else if (str.equals("!wtf"))
        {
          localObject = "───╔╗╔═╗\n╔╦╦╣╚╣═╣\n║║║║╔╣╔╝\n╚══╩═╩╝";
        }
        else if (str.equals("!lol"))
        {
          localObject = "┈▁┈┈┈┈▁▁▁┈┈▁\n╱╱▏┈┈╱╱╱╱▏╱╱▏\n▇╱▏┈┈▇▇▇╱▏▇╱▏\n▇╱▏▁┈▇╱▇╱▏▇╱▏▁\n▇╱╱╱▏▇╱▇╱▏▇╱╱╱▏\n▇▇▇╱┈▇▇▇╱┈▇▇▇╱";
        }
        else if (str.equals("!hi"))
        {
          localObject = "▒█░▒█ ▀█▀\n▒█▀▀█ ▒█░\n▒█░▒█ ▄█▄";
        }
        else if (str.equals("!nice"))
        {
          localObject = "███╗   ██╗ \n████╗  ██║ \n██╔██╗ ██║ \n██║╚██╗██║ \n██║ ╚████║ \n╚═╝  ╚═══╝ \n           \n██╗        \n██║        \n██║        \n██║        \n██║        \n╚═╝        \n           \n ██████╗   \n██╔════╝   \n██║        \n██║        \n╚██████╗   \n ╚═════╝   \n           \n███████╗   \n██╔════╝   \n█████╗     \n██╔══╝     \n███████╗   \n╚══════╝";
        }
        else if (str.equals("!fail"))
        {
          localObject = "▄▄▄▄▄▄▄▄▄▄▄▄\n██▌▄▌▄▐▐▌███\n██▌▄▌▄▐▐▌▀██\n▀▀▀▀▀▀▀▀▀▀▀▀";
        }
        else if (str.equals("!stfu"))
        {
          localObject = "██████████\n██████████\n███\n██████████\n██████████\n                    ███\n██████████\n██████████\n\n██████████\n██████████\n       ████\n       ████\n       ████\n       ████\n       ████\n       ████\n\n██████████\n██████████\n████\n█████████\n█████████\n████\n████\n████\n\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n██████████\n██████████";
        }
		else if (str.equals("!rekt1"))
		{
			localObject = "╔͚͔̙̮͙͋͆͗͋̒̕͜═͍͙̱̲̳͓͊̌̓̈́̾̎═̧̠͇̙̠̜̋̀̿̀̾̚═̲͓̱̖̘̪͗͑̈́͊̚͠╦̢̬̼͉̰͙͆͆̂̃̒̈́═̡̦̟͉̝͋̃͛͑̒̇͜═̧͉̤̦̺̂̈́̾̏̽̇͜═͚͇̙͉̲͑͒̈̑̋̕ͅ╦̣͓͈̻͕̂̓̀̎̑̈́͜╗̮̝̗̰͍̣̑̒̊͊̈́͘╔̻̳̞̬̳̭͌̂̾̀͑̅═̖̘͚͍͇̯͛̄̿͛̓͠╦̢̦͈͚̉̉̓̽͝͝ͅͅ═̪̜̰͎̼͂̏̅͗̕̚ͅ═̧̜̙̖̞̿̑̐̈̚͘ͅ═̢̙̠̗͓̞͊̓̀̏͋͠═̨̨̛͖̱̬̥̆̊̑̔̀╗̨̛̳̼̬̪͉̏͌̇́̈\n̻͎̲̼̓̂͂͛̄͘͜ͅ║͖̮̹͔̯͑̋͆͌̾̅ͅ╔̭̱͇̟̣̰̍͆̆́̽̈═̰̞̺͍̺̅͛̀̆̅́ͅ╗̦͓̣̬̲͎͒́̋̒̚͘║̩̙̦̣̳͇̔̾́̉̄͘╔̪̙̪̭̭̣͊̑̍̓̃̊═̢̱͈͎͆̇̓͂̽͆͜͜═̛̤̱̲̣̹̺̅͐̋̎̿╣̛̦̥̘̫͈̍́́̚̚͜║̨̧͓̱̗͗͊͌̈́̕͠ͅ║̛̪̜͇̱̭̦͂̆̃̃̈́╔̦̙͓̜̣̲̏̿̓͊̂͘╣̨̭̠͈̖͍̾̈́̏̇͋̚╔̧̘̮͎̜̲̍̋͐̈̈́̊╗̢̡͖̠̺̤͐̐͂̽̎̓╔̢̦̪͇̹̤͌̓͛̎̾̚╗̧̣̻̯̰̳̇̄̂͛͊͠║̧̰͙͙͖̱̄͗̾̋̇͘\ņ̲̬̤̞̳͗̀͑́͋͘║͇̣͙̟̻̣͐̊̃͛̄̉╚̲̙͍̹͔̓̀̈́̐̓͝ͅ═̨͚̻͎̼̰͆͌͂̈̑̚╝̨̡̫͇͈̙͛͐̌̌̌̓║̧̘͔̻̮̗̓́̌̓̅̃╚̨̨̻̜̪̖̇́͛͛͝͠═̨̛̪̭̝̮̅͐̏͊̚͜═̧̨̹͇̙͇͊͊́̔͊͘╣̗̱̮̪̣͓̌̄́̀͒͝╚͉̗̭͓͕̖̈́̊̓̅͘╝͚̠͔̬̯͉̌̃̑̓͝͝╝̡̟͇̘̭̱̀̎́͌͋͘╚̛̟̜̮̜͈̭̉̎̋̿̒╝̨̱̮͍̜̤̿̍̐̑̽̅║̢̟̘̻̻͖̈́̿̿̿̔̏║̟͙̖̖̗̗͗̑̐͐͒͌╚̬̰̦̞͍̝̅̌̌̾͛͘╝̢̨̙̳̯̣͋̏̀͛͛̀\ņ̝̖͈͇̫̓͊́̏̉̅║̢͙̲̼͍̥̒̈́̓͒̕╔̡̡̫͔̱͍͗͐̍̏̾̚╗͇̠͖̤̣̖̓̉̓͆͛̚╔̢̪̞̙̫̪̈́̍̿́̎͘╣̡͈̯̦̙͕͂̓̎̒̓͘╔̡̣͈͇̭̂͆̈̅͆̌ͅ═̰̯̬͈͖̳̒͛͋̓͗̚═̱͍̦͍̬̟̎̔̿̀͊̕╣̧̬͚̲͕̘̀͗̊͌͊͘╔̧̪̬̟͉̬͂̑̇̄̈́͝╗͕͖͍̮͇̖̈́̈̃̾͝͝║̡̯̲̪̘̠͋̆̽͐̀̈─̨͔͍̠͖̱̾͛̎̃̀̿─̧̖͇̣̟̘͒́̈́̔̃͌║̡̲̝̜̗̳͆̀̔̿͆͘║̢̝̤̰̭̤̃̇̿͆̾̽\ņ͈̻͈̭̑̿̅̍͗̕ͅ║̼̹͈͖̗̪̓̊̒͋͐̕║̡̨̛̬͚̂́͛̾͜͝ͅ║̪̺͉̹̿̊̄͐́͝ͅͅ╚̧͙̳̺̺͕̂͌̊̿͒̕╣̡͙͍̪̗͓̿̊̓͌͑̿╚̢͎̦̱͔̔̉͒̌̔͘ͅ═̢̛͚͔͖̣̤̽̈́͛̏═̭̬̳͕͔̬̀͋̆̒̓́╣̨͚̥̙͖͇̒̂́̋̿͠║̡̰̦̠̝͚̋̓̂̇͐͆║̰͎͙̠̖͕͂͛̓͆͝͝╚͓̺͈͇̥̼͂͐́̈́̀͝╗̨̙͙̭̱͕͋̾̓̊͋̕─̢̝̠̻̫͑̀̑͌͋͝ͅ║̢͓͚̹̲̒̅̈̈́̓̑͜║͇̖͓̪͚̻͂͑̐͊͘͝\n̯̬̺̖̰͔̉̈̍̓͑͠╚̩̳̮̝̺̇̽͑̒̏͠ͅ╝͉͚̗̗̬̜͒̉̓̚͝͠╚̱͕͓͇̣͇́͆͒͛͋͒═̨̞͎̹̠͍̒̈́̾͊̍̕╩̙͙̭̘͖̞̌͆̈́́́̚═̧͓̝̣̃̔̅̀͌̕͜ͅ═͎̭̖̥̗͕͂̑́͋̄̔═̢̥͇̩͎̙̐͗̒͂̎̀╩̭̬͎̼̩͙͆͐̈̉̇͋╝̨͔͍̮̥̙̅̎̓̈͘͝╚͖͕̣̝͙̗̀̀̓̆̇͠═̙̼̖̙̮̇͒̃̈͌̃ͅ╝̡̣̙͎̰̌̏̀̋̋͊͜─̼̝̬̳͇͔̅̿͛͗̿̕╚͙̺̟̫̫͆͗̾̃͗͘ͅ╝͎͙̆́̓̋̈͠ ";
		}
		else if (str.equals("!rekt2"))
		{
			localObject = "";
		}
        else if (str.equals("!fuckyou"))
        {
          localObject = "██████████\n██████████\n████\n█████████\n█████████\n████\n████\n████\n\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n██████████\n██████████\n\n██████████\n██████████\n████     \n████     \n████     \n████     \n██████████\n██████████\n\n████    ████\n████   ████\n████  ████\n████ ████\n████████\n████  ████\n████    ████\n████      ████\n████       ████\n\n\n\n\n████      ████\n████      ████\n████      ████\n████      ████\n  █████████\n        ████\n        ████\n        ████\n        ████\n        ████\n\n██████████\n██████████\n████     ████\n████     ████\n████     ████\n████     ████\n██████████\n██████████\n\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n████     ████\n██████████\n██████████";
        }
//END Word Commands
//Custom Commands
        else if (str.equals("!commands5"))
        {
            localObject = "All commands,\nAll Commands: !Commands\nDevs & info: !Devsi\nSYSCUS Information: !SYSCUS\nSYSCUS Role Play: !SRP\nEducation: !Education\nFunctions: !Commands2\nArt: !Commands3\nWords: !Commands4\nCustom Commands: !Commands5\nHELP: !HELP\n\nCustom Commands:\n!CustomCom";
        }
//Text Styles
        else if (str.equals("!customcom"))
        {
            localObject = "Custom Commands:\n\n!a \"text...\" (ASCII Text)\n!p \"text...\" (Carty Text)\n!b \"text...\" (Bold Text, Uppercase)\n!o \"text...\" (Bold Text, Lowercase)\n!c \"text...\"(EnCircled Text)\n!h \"text...\" (Blue Text)\n!g \"text...\" (Gothic Text, Uppercase)\n!e \"text\" (Gothic Text, Lowercase)\n!f \"text..\" (Reversed letters)";
        }
        else if (str.equals("!test17"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test18"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test19"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test20"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test21"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test22"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test23"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test24"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test25"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test26"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test27"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test28"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test29"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test30"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test31"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test32"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test33"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test34"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test35"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test36"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test37"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test38"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test39"))
        {
            localObject = "Backup Command";
        }
        else if (str.equals("!test40"))
        {
            localObject = "Backup Command";
        }
//END Custom Commands
//Text Styles
//ASCII Text
        else if ((str.toLowerCase().startsWith("!a ")) && (str.length() >= 2))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "▒▒▒▒▒▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒█▒█▒▒▒\n▒▒█▒▒▒█▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n").replace("b", "▒▒▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒██████▒▒\n").replace("c", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n").replace("d", "▒▒▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒██████▒▒\n").replace("e", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n").replace("f", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n").replace("g", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒██▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("h", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n").replace("i", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒███████▒\n").replace("j", "▒▒▒▒▒▒▒▒▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("k", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒█▒▒\n▒█████▒▒▒\n▒█▒▒▒▒█▒▒\n▒█▒▒▒▒▒█▒\n").replace("l", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n").replace("m", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒██▒▒▒██▒\n▒█▒█▒█▒█▒\n▒█▒▒█▒▒█▒\n▒█▒▒▒▒▒█▒\n").replace("n", "▒▒▒▒▒▒▒▒▒\n▒██▒▒▒▒█▒\n▒█▒█▒▒▒█▒\n▒█▒▒█▒▒█▒\n▒█▒▒▒█▒█▒\n▒█▒▒▒▒██▒\n").replace("o", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("p", "▒▒▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒██████▒▒\n▒█▒▒▒▒▒▒▒\n▒█▒▒▒▒▒▒▒\n").replace("q", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒█▒█▒\n▒█▒▒▒▒██▒\n▒████████\n").replace("r", "▒▒▒▒▒▒▒▒▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒██████▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n").replace("s", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒███████▒\n").replace("t", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n").replace("u", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("v", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒▒█▒▒▒█▒▒\n▒▒▒█▒█▒▒▒\n▒▒▒▒█▒▒▒▒\n").replace("w", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒█▒▒█▒\n▒█▒█▒█▒█▒\n▒██▒▒▒██▒\n▒█▒▒▒▒▒█▒\n").replace("x", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒▒█▒▒▒█▒▒\n▒▒▒███▒▒▒\n▒▒█▒▒▒█▒▒\n▒█▒▒▒▒▒█▒\n").replace("y", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒▒█▒▒▒█▒▒\n▒▒▒█▒█▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n").replace("z", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒▒▒█▒▒\n▒▒▒███▒▒▒\n▒▒█▒▒▒▒▒▒\n▒███████▒\n").replace(" ", "\n").replace("0", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒█▒█▒\n▒█▒▒█▒▒█▒\n▒█▒█▒▒▒█▒\n▒███████▒\n").replace("1", "▒▒▒▒▒▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒██▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒█▒▒▒▒\n▒███████▒\n").replace("2", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n").replace("3", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒███████▒\n").replace("4", "▒▒▒▒▒▒▒▒▒\n▒█▒▒▒▒▒█▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n").replace("5", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒██████▒▒\n▒▒▒▒▒▒▒█▒\n▒██████▒▒\n").replace("6", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("7", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n▒▒▒▒▒▒▒█▒\n").replace("8", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n").replace("9", "▒▒▒▒▒▒▒▒▒\n▒███████▒\n▒█▒▒▒▒▒█▒\n▒███████▒\n▒▒▒▒▒▒▒█▒\n▒███████▒\n").replace("?", "▒▒▒▒▒▒▒▒▒\n▒▒█████▒▒\n▒█▒▒▒▒▒█▒\n▒▒▒▒▒▒█▒▒\n▒▒▒▒█▒▒▒▒\n▒▒▒▒▒▒▒▒▒\n▒▒▒▒█▒▒▒▒\n").replace("#", "▒▒▒▒▒▒▒▒▒\n▒▒█▒▒▒█▒▒\n▒███████▒\n▒▒█▒▒▒█▒▒\n▒███████▒\n▒▒█▒▒▒█▒▒\n");
        }
//Carty Text
        else if ((str.toLowerCase().startsWith("!p ")) && (str.length() >= 2))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "╔═══╗\n║╔═╗║\n║║─║║\n║╚═╝║\n║╔═╗║\n╚╝─╚╝").replace("b", "╔══╗\n║╔╗║\n║╚╝╚╗\n║╔═╗║\n║╚═╝║\n╚═══╝").replace("c", "╔═══╗\n║╔═╗║\n║║─╚╝\n║║─╔╗\n║╚═╝║\n╚═══╝").replace("d", "╔═══╗\n╚╗╔╗║\n─║║║║\n─║║║║\n╔╝╚╝║\n╚═══╝").replace("e", "╔═══╗\n║╔══╝\n║╚══╗\n║╔══╝\n║╚══╗\n╚═══╝").replace("f", "╔═══╗\n║╔══╝\n║╚══╗\n║╔══╝\n║║\n╚╝").replace("g", "╔═══╗\n║╔═╗║\n║║─╚╝\n║║╔═╗\n║╚╩═║\n╚═══╝").replace("h", "╔╗─╔╗\n║║─║║\n║╚═╝║\n║╔═╗║\n║║─║║\n╚╝─╚╝").replace("i", "╔══╗\n╚╣╠╝\n─║║\n─║║\n╔╣╠╗\n╚══╝").replace("j", "──╔╗\n──║║\n──║║\n╔╗║║\n║╚╝║\n╚══╝").replace("k", "╔╗╔═╗\n║║║╔╝\n║╚╝╝\n║╔╗║\n║║║╚╗\n╚╝╚═╝").replace("l", "╔╗\n║║\n║║\n║║─╔╗\n║╚═╝║\n╚═══╝").replace("m", "╔═╗╔═╗\n║║╚╝║║\n║╔╗╔╗║\n║║║║║║\n║║║║║║\n╚╝╚╝╚╝").replace("n", "╔═╗─╔╗\n║║╚╗║║\n║╔╗╚╝║\n║║╚╗║║\n║║─║║║\n╚╝─╚═╝").replace("o", "╔═══╗\n║╔═╗║\n║║─║║\n║║─║║\n║╚═╝║\n╚═══╝").replace("p", "╔═══╗\n║╔═╗║\n║╚═╝║\n║╔══╝\n║║\n╚╝").replace("q", "╔═══╗\n║╔═╗║\n║║─║║\n║║─║║\n║╚═╝║\n╚══╗║\n───╚╝").replace("r", "╔═══╗\n║╔═╗║\n║╚═╝║\n║╔╗╔╝\n║║║╚╗\n╚╝╚═╝").replace("s", "╔═══╗\n║╔═╗║\n║╚══╗\n╚══╗║\n║╚═╝║\n╚═══╝").replace("t", "╔════╗\n║╔╗╔╗║\n╚╝║║╚╝\n──║║\n──║║\n──╚╝").replace("u", "╔╗─╔╗\n║║─║║\n║║─║║\n║║─║║\n║╚═╝║\n╚═══╝").replace("v", "╔╗──╔╗\n║╚╗╔╝║\n╚╗║║╔╝\n─║╚╝║\n─╚╗╔╝\n──╚╝").replace("w", "╔╗╔╗╔╗\n║║║║║║\n║║║║║║\n║╚╝╚╝║\n╚╗╔╗╔╝\n─╚╝╚╝").replace("x", "╔═╗╔═╗\n╚╗╚╝╔╝\n─╚╗╔╝\n─╔╝╚╗\n╔╝╔╗╚╗\n╚═╝╚═╝").replace("y", "╔╗──╔╗\n║╚╗╔╝║\n╚╗╚╝╔╝\n─╚╗╔╝\n──║║\n──╚╝").replace("z", "╔════╗\n╚══╗═║\n──╔╝╔╝\n─╔╝╔╝\n╔╝═╚═╗\n╚════╝").replace("0", "╔═══╗\n║╔═╗║\n║║║║║\n║║║║║\n║╚═╝║\n╚═══╝").replace("1", "─╔╗\n╔╝║\n╚╗║\n─║║\n╔╝╚╗\n╚══╝").replace("2", "╔═══╗\n║╔═╗║\n╚╝╔╝║\n╔═╝╔╝\n║║╚═╗\n╚═══╝").replace("3", "╔═══╗\n║╔═╗║\n╚╝╔╝║\n╔╗╚╗║\n║╚═╝║\n╚═══╝").replace("4", "╔╗─╔╗\n║║─║║\n║╚═╝║\n╚══╗║\n───║║\n───╚╝").replace("5", "╔═══╗\n║╔══╝\n║╚══╗\n╚══╗║\n╔══╝║\n╚═══╝").replace("6", "╔═══╗\n║╔══╝\n║╚══╗\n║╔═╗║\n║╚═╝║\n╚═══╝").replace("7", "╔═══╗\n║╔═╗║\n╚╝╔╝║\n──║╔╝\n──║║\n──╚╝").replace("8", "╔═══╗\n║╔═╗║\n║╚═╝║\n║╔═╗║\n║╚═╝║\n╚═══╝").replace("9", "╔═══╗\n║╔═╗║\n║╚═╝║\n╚══╗║\n╔══╝║\n╚═══╝").replace("!", "╔╗\n║║\n║║\n╚╝\n╔╗\n╚╝").replace("?", "╔═══╗\n║╔═╗║\n╚╝╔╝║\n──║╔╝\n──╔╗\n──╚╝");
        }
//Bold Text, Uppercase
        else if ((str.toLowerCase().startsWith("!b ")) && (str.length() >= 2))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "𝔸").replace("b", "𝔹").replace("c", "ℂ").replace("d", "𝔻").replace("e", "𝔼").replace("f", "𝔽").replace("g", "𝔾").replace("h", "ℍ").replace("i", "𝕀").replace("j", "𝕁").replace("k", "𝕂").replace("l", "𝕃").replace("m", "𝕄").replace("n", "ℕ").replace("o", "𝕆").replace("p", "ℙ").replace("q", "ℚ").replace("r", "ℝ").replace("s", "𝕊").replace("t", "𝕋").replace("u", "𝕌").replace("v", "𝕍").replace("w", "𝕎").replace("x", "𝕏").replace("y", "𝕐").replace("z", "ℤ").replace("0", "𝟘").replace("1", "𝟙").replace("2", "𝟚").replace("3", "𝟛").replace("4", "𝟜").replace("5", "𝟝").replace("6", "𝟞").replace("7", "𝟟").replace("8", "𝟠").replace("9", "𝟡");
        }
//Bold Text, Lowercase
        else if ((str.toLowerCase().startsWith("!o ")) && (str.length() >= 2))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "𝕒").replace("b", "𝕓").replace("c", "𝕔").replace("d", "𝕕").replace("e", "𝕖").replace("f", "𝕗").replace("g", "𝕘").replace("h", "𝕙").replace("i", "𝕚").replace("j", "𝕛").replace("k", "𝕜").replace("l", "𝕝").replace("m", "𝕞").replace("n", "𝕟").replace("o", "𝕠").replace("p", "𝕡").replace("q", "𝕢").replace("r", "𝕣").replace("s", "𝕤").replace("t", "𝕥").replace("u", "𝕦").replace("v", "𝕧").replace("w", "𝕨").replace("x", "𝕩").replace("y", "𝕪").replace("z", "𝕫").replace("0", "𝟘").replace("1", "𝟙").replace("2", "𝟚").replace("3", "𝟛").replace("4", "𝟜").replace("5", "𝟝").replace("6", "𝟞").replace("7", "𝟟").replace("8", "𝟠").replace("9", "𝟡");
        }
//(En)Circled Text
        else if ((str.toLowerCase().startsWith("!c ")) && (str.length() >= 2))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "ⓐ").replace("b", "ⓑ").replace("c", "ⓒ").replace("d", "ⓓ").replace("e", "ⓔ").replace("f", "ⓕ").replace("g", "ⓖ").replace("h", "ⓗ").replace("i", "ⓘ").replace("j", "ⓙ").replace("k", "ⓚ").replace("l", "ⓛ").replace("m", "ⓜ").replace("n", "ⓝ").replace("o", "ⓞ").replace("p", "ⓟ").replace("q", "ⓠ").replace("r", "ⓡ").replace("s", "ⓢ").replace("t", "ⓣ").replace("u", "ⓤ").replace("v", "ⓥ").replace("w", "ⓦ").replace("x", "ⓧ").replace("y", "ⓨ").replace("z", "ⓩ").replace("0", "➓").replace("1", "➊").replace("2", "➋").replace("3", "➌").replace("4", "➍").replace("5", "➎").replace("6", "➏").replace("7", "u2790").replace("8", "u2791").replace("9", "u2792");
        }
//Blue Text
        else if ((str.toLowerCase().startsWith("!h ")) && (str.length() >= 4))
        {
            localObject = str.substring(3).toLowerCase().replace("a", "‌🇦").replace("b", "‌🇧").replace("c", "‌🇨").replace("d", "‌🇩").replace("e", "‌🇪").replace("f", "‌🇫").replace("g", "‌🇬").replace("h", "‌🇭").replace("i", "‌🇮").replace("j", "‌🇯").replace("k", "‌🇰").replace("l", "‌🇱").replace("m", "‌🇲").replace("n", "‌🇳").replace("o", "‌🇴").replace("p", "‌🇵").replace("q", "‌🇶").replace("r", "‌🇷").replace("s", "‌🇸").replace("t", "‌🇹").replace("u", "‌🇺").replace("v", "‌🇻").replace("w", "‌🇼").replace("x", "‌🇽").replace("y", "‌🇾").replace("z", "‌🇿").replace("?", "‌?❔").replace("!", "‌?❕");
        }
//Gothic Text, Uppercase
        else
        {
            localObject = str;
            if (str.toLowerCase().startsWith("!g "))
            {
                localObject = str;
                if (str.length() >= 4) {
                    localObject = str.substring(3).toLowerCase().replace("a", "𝔄").replace("b", "𝔅").replace("c", "ℭ").replace("d", "𝔇").replace("e", "𝔈").replace("f", "𝔉").replace("g", "𝔊").replace("h", "ℌ").replace("i", "ℑ").replace("j", "𝔍").replace("k", "𝔎").replace("l", "𝔏").replace("m", "𝔐").replace("n", "𝔑").replace("o", "𝔒").replace("p", "𝔓").replace("q", "𝔔").replace("r", "ℜ").replace("s", "𝔖").replace("t", "𝔗").replace("u", "𝔘").replace("v", "𝔙").replace("w", "𝔚").replace("x", "𝔛").replace("y", "𝔜").replace("z", "ℨ");
                }
            }
        }
//Gothic Text, Lowercase
          else
          {
              localObject = str;
              if (str.toLowerCase().startsWith("!e "))
              {
                  localObject = str;
                  if (str.length() >= 4) {
                      localObject = str.substring(3).toLowerCase().replace("a", "𝔞").replace("b", "𝔟").replace("c", "𝔠").replace("d", "𝔡").replace("e", "𝔢").replace("f", "𝔣").replace("g", "𝔤").replace("h", "𝔥").replace("i", "𝔦").replace("j", "𝔧").replace("k", "𝔨").replace("l", "𝔩").replace("m", "𝔪").replace("n", "𝔫").replace("o", "𝔬").replace("p", "𝔭").replace("q", "𝔮").replace("r", "𝔯").replace("s", "𝔰").replace("t", "𝔱").replace("u", "𝔲").replace("v", "𝔳").replace("w", "𝔴").replace("x", "𝔵").replace("y", "𝔶").replace("z", "𝔷");
                  }
              }
          }
//Flipped Text
          else
          {
              localObject = str;
              if (str.toLowerCase().startsWith("!f "))
              {
                  localObject = str;
                  if (str.length() >= 4) {
                      localObject = str.substring(3).toLowerCase().replace("a", "ɐ").replace("b", "q").replace("c", "ɔ").replace("d", "p").replace("e", "ǝ").replace("f", "ɟ").replace("g", "ƃ").replace("h", "ɥ").replace("i", "ı").replace("j", "ɾ").replace("k", "ʞ").replace("l", "l").replace("m", "ɯ").replace("n", "u").replace("o", "o").replace("p", "d").replace("q", "b").replace("r", "ɹ").replace("s", "s").replace("t", "ʇ").replace("u", "n").replace("v", "ʌ").replace("w", "ʍ").replace("x", "x").replace("y", "ʎ").replace("z", "z").replace("?", "¿").replace("!", "¡");
                  }
              }
          }
//END Text Styles
      }
    }
      for (;;)
    {
      return (String)localObject;
      localObject = (k)kik.a.b.a.f.a(this, 4);
      if (localObject != null)
      {
        localObject = ((k)localObject).a();
      }
      else
      {
        localObject = (j)kik.a.b.a.f.a(this, 7);
        if (localObject != null) {
          localObject = ((j)localObject).a();
        } else {
          localObject = null;
        }
      }
    }
  }
  {
    Object localObject = (kik.a.c.a.g)f.a(this, kik.a.c.a.g.class);
    if (localObject != null)
      return ((kik.a.c.a.g)localObject).a();
    localObject = (kik.a.c.a.l)f.a(this, kik.a.c.a.l.class);
    if (localObject != null)
      return ((kik.a.c.a.l)localObject).a();
    localObject = (k)f.a(this, k.class);
    if (localObject != null)
      return ((k)localObject).a();
    return (String)null;
  }

  final void a(int paramInt)
  {
    if (paramInt == -100)
      this.d = paramInt;
    do
      return;
    while (paramInt <= this.d);
    this.d = paramInt;
  }

  public final void a(long paramLong)
  {
    this.n = paramLong;
  }

  public final void a(List paramList)
  {
    this.i = paramList;
  }

  public final void a(f paramf)
  {
    this.j.add(paramf);
  }

  public final void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public final void a(byte[] paramArrayOfByte)
  {
    this.m = paramArrayOfByte;
  }

  public final String b()
  {
    return this.f;
  }

  public final void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public final int c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return this.c;
  }

  public final long e()
  {
    return this.k;
  }

  public final int f()
  {
    return this.e;
  }

  public final void g()
  {
    this.e += 1;
  }

  public final String h()
  {
    return this.b;
  }

  public final String i()
  {
    return this.a;
  }

  public final boolean j()
  {
    return this.g;
  }

  public final boolean k()
  {
    return this.l;
  }

  public final Vector l()
  {
    return this.j;
  }

  public final boolean m()
  {
    return this.h;
  }

  public final void n()
  {
    this.h = true;
  }

  public final byte[] o()
  {
    return this.m;
  }

  public final long p()
  {
    return this.n;
  }

  public final List q()
  {
    return this.i;
  }

  public final int r()
  {
    return this.o;
  }

  public final String toString()
  {
    return "message: " + a();
  }

  public static enum a
  {
  }
}

/* Location:           SYSCUS:\SIP\EX\Projects\Application Development\APK MOD KIT\SYSCUS(Kik)\SYSCUSKik [V=2.1.1.1.EX]\classes-dex2jar.jar
 * Qualified Name:     kik.a.c.q
 * JD-Core Version:    0.6.0
 */
