# Add any ProGuard configurations specific to this
# extension here.

-keep public class tech.kaffeine.m3colors.M3Colors {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'tech/kaffeine/m3colors/repack'
-flattenpackagehierarchy
-dontpreverify
-keeppackagenames gnu.kawa.functions.**
-keeppackagenames gnu.expr.**
