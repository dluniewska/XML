<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Lista województw</title>
            </head>

            <body>
                <h2>Podział administracyjny Polski</h2>
                <table border="1">
                    <tr bgcolor="grey">
                        <th>Wojewodztwo</th>
                        <th>Stolica</th>
                        <th>Powierzchnia<br/>w km<sup>2</sup></th>
                        <th>Liczba ludności</th>
                        <th>Gęstość zaludnienia<br/>w os/km<sup>2</sup></th>
                        <th>Liczba miast</th>
                        <th>Liczba miast na prawach powiatu</th>
                        <th>Liczba powiatów</th>
                        <th>Liczba gmin miejskich</th>
                        <th>Liczba gmin miejsko-wiejskich</th>
                        <th>Liczba gmin wiejskich</th>
                        <th>Liczba obszarów wiejskich</th>
                        <th>Delegatury</th>
                    </tr>
                    <xsl:for-each select="wojewodztwa/catalog/wojewodztwo">
                        <tr>
                            <td><xsl:value-of select="@name" /></td>
                            <td><xsl:value-of select="stolica" /></td>
                            <td><xsl:value-of select="powierzchnia" /></td>
                            <td><xsl:value-of select="populacja/liczba_ludnosci" /></td>
                            <td><xsl:value-of select="populacja/gestosc" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'miasto'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'miasto na prawach powiatu'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'powiat'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'gmina miejska'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'gmina miejsko-wiejska'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'gmina wiejska'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'obszar wiejski'])" /></td>
                            <td><xsl:value-of select="count(podzial_adm/row/NAZWA_DOD[. = 'delegatura'])" /></td>
                        </tr>
                    </xsl:for-each>
                </table>

<!--                <xsl:for-each select="wojewodztwa/catalog/wojewodztwo">-->
<!--                    <h2><xsl:value-of select="@name" /></h2>-->
<!--                    <table border="1">-->
<!--                        <tr bgcolor="grey">-->
<!--                            <th>Miasta</th>-->
<!--                            <th>Miasta na prawach powiatu</th>-->
<!--                            <th>Powiaty</th>-->
<!--                            <th>Gminy miejskie</th>-->
<!--                            <th>Gminy miejsko-wiejskie</th>-->
<!--                            <th>Gmin wiejskie</th>-->
<!--                            <th>Obszary wiejskie</th>-->
<!--                        </tr>-->
<!--                            <xsl:for-each select="wojewodztwa/catalog/wojewodztwo">-->
<!--                            <xsl:for-each select="podzial_adm/row">-->
<!--                            <tr>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'miasto']" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'miasto na prawach powiatu'])" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'powiat'])" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'gmina miejska'])" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'gmina miejsko-wiejska']" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'gmina wiejska']" /></td>-->
<!--                                <td><xsl:value-of select="NAZWA_DOD[. = 'obszar wiejski']" /></td>-->
<!--                            </tr>-->
<!--                            </xsl:for-each>-->
<!--                            </xsl:for-each>-->
<!--                    </table>-->
<!--                </xsl:for-each>-->
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>