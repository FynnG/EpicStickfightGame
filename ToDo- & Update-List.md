**_Fynn: Ich plage mich gerade noch mit Java-9-Problemen umher, wenn ich diese in Griff bekomme, kann ich weiter programmieren und euch erklären, wie ihr zu JavaSE 9.0.4 updaten könnt._**

Auftrag für **Edwin, Jonas, Fynn**

*NUY*: Not Uploaded yet                                                                                                    <br/>
*HTBM*: Has to be made                                                                                                     <br/>
*CWB*: (has to be) created (by) WindowBuilder; otherwhise the *Design*-Tab is missing; *(Right-Click on package -> New -> Other -> WindowBuilder -> JFrame)* 

**Updates:**                                                                                                               
---
-**_"DesignBar.java"_** erhält zusätzliche Zeile *setOpaque(false);* zum Vorbeugen der fehlenden Transparenz; *NUY*        <br/>
-entsprechend der *FrameLauncherOptions.java*-Datei erweitert sich auch der Quellcode in **_"Launcher.java"_**; *NUY*

**Java-Dateien:**                                                                                                          
---
-Options-Frame für Launcher; *bietet Auflösungseinstellung, Full-Screen-Option* | **_"FrameLauncherOptions.java"_** in Package *launcher*; *NUY* & *CWB*                                                                                                  <br/>
-neues Package namens **_"additionalClasses"_**                                                                            <br/>
-Externe Klasse für Auflösungsbearbeitung; *beeinhaltet switch-case-Anweisung für alle zulässigen Auflösungen; wird jedes Mal aufgerufen, um Objektgrößen auszurechnen* | **_"Resolution.java"_** in Package *additionalClasses*; *NUY*
-*additionalClasses* wird um **_ResolutionDifferenceCalculator.java"_** ergänzt; *dient dem Auslesen der Pixelgrößen in Bezug auf Breite und Höhe für beispielsweise Wide XGA (Eddies Auflösung); heißt Breite und Höhe eines Design für Full-HD eingeben und es rechnet Breite und Höhe für Wide XGA aus*; *NUY* & *CWB*                                                                <br/>
-Abstrakte Klasse **_"AbstractMap"_**, *die den Grundbaustein für alle unsere Maps darstellt; enthält u.a. Methoden zum Registrieren von Farben als Boden, auf dem die Stickmans laufen können*; *NUY*

**Images:**                                                                                                               
---
-**_"PlayMenuNormalGameButton.png"_** für Normal-Game-JButton, **_"PlayMenuRankedButton.png"_** für Ranked-JButton, **_"PlayMenuChaosModeButton.png_** für Chaos-Mode-JButton, **_"PlayMenuCustomGameButton.png"_** für Custom-Game-JButton; *alle in **Breite: 230px** und **Höhe: 420px***; *HTBM*                                                                          <br/>
-Design für **_"btnBack"_**-Button in *panelMainMenu* und *panelPlayMenu* um zum zuvorrigen Panel zu gelangen; ***Breite: 160px** und **Höhe: 40px***; *HTBM*                                                                                        <br/>
-Neue Maps designen; ***Breite: 1920px** und **Höhe: 1080px***; *HTBM*

**Nachrichten:**                                                                   				                          		   
---
**@Eddie**: *Hast du **1366x768** oder **1360x768**  als Bildschirmauflösung?*                                             <br/>
**@all**: *In Zukunft wird es ein Bild geben, das den Project-Tree anzeigt, um die Vervollständigung des Projektordners zu vereinfachen*                                                                                                              <br/>
**@all:** *Was hält ihr davon, wenn der Mauscursor zu einer Hand wird (gewöhnlicher HAND_CURSOR), sobald er sich über einem Button befindet, bzw sollen wir einen eigenen Cursor für InGame designen?*                                                 <br/>
**@Jonas:** *Du wirst wohl bald für **ALLE** Designs eine Zweitdatei passend zu Edwins Bildschirmauflösung machen müssen.*

**Antworten:**                                                                                                            
---
*In die folgenden Zeilen schreiben:*                                                                                       <br/>





