<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes" />

    <xsl:template match="/">
        <wojewodztwa>
            <xsl:apply-templates select="wojewodztwa/catalog/wojewodztwo" />
        </wojewodztwa>
    </xsl:template>
    <xsl:template match="wojewodztwo">
        <wojewodztwo>
            <nazwa>
                <xsl:value-of select="@name"/>
            </nazwa>
            <stolica>
                <xsl:value-of select="stolica" />
            </stolica>
            <powierzchnia>
                <xsl:value-of select="powierzchnia" />
            </powierzchnia>
            <liczba_ludnosci>
                <xsl:value-of select="populacja/liczba_ludnosci" />
            </liczba_ludnosci>
        </wojewodztwo>
    </xsl:template>
</xsl:stylesheet>