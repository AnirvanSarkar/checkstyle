/*xml
<module name="Checker">
  <module name="LineLength">
      <property name="max" value="100"/>
  </module>

  <module name="SuppressWithPlainTextCommentFilter">
    <property name="offCommentFormat" value='=\s+"""'/>
    <property name="onCommentFormat" value='^\s+""";'/>
  </module>

</module>


*/
// Java17
package com.puppycrawl.tools.checkstyle.filters.suppresswithplaintextcommentfilter;

// xdoc section -- start
public class Example9 {

  static final String LOCATION_CSV_SAMPLE = """
          locationId,label,regionId,regionLabel,vendorId,vendorLabel,address,address2,city,stateProvinceCode,zipCode,countryCode,latitude,longitude
          ST001,Station 001,ZONE1,Zone 1,CP1,Competitor 1,123 Street,Unit 2,Houston,TX,77033,US,29.761496813335178,-95.53049214204984
          ST002,Station 002,ZONE2,,CP2,,668 Street,Unit 23,San Jose,CA,95191,US,37.35102477242508,-121.9209934020318
          """;
  // filtered violation 5 lines above 'Line is longer than 100 characters (found 147).'
  // filtered violation 5 lines above 'Line is longer than 100 characters (found 133).'
  // filtered violation 5 lines above 'Line is longer than 100 characters (found 116).'

  // violation below, 'Line is longer than 100 characters (found 183).'
  static final String SINGLE_LINE_SAMPLE = "locationId,label,regionId,regionLabel,vendorId,vendorLabel,address,address2,city,stateProvinceCode,zipCode,countryCode,latitude,longitude";
}
// xdoc section -- end
