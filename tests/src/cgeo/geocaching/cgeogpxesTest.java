package cgeo.geocaching;

import android.test.ActivityInstrumentationTestCase2;

public class cgeogpxesTest extends ActivityInstrumentationTestCase2<cgeogpxes> {
    private cgeogpxes importGpxActivity = new cgeogpxes();

    public cgeogpxesTest() {
        super("cgeo.geocaching", cgeogpxes.class);
    }

    public void testFileNameMatches() {
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.gpx"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.GPX"));
        assertTrue(importGpxActivity.filenameBelongsToList(".gpx"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.loc"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.LOC"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.zip"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567.ZIP"));
        assertTrue(importGpxActivity.filenameBelongsToList("12345678.zip"));
        assertTrue(importGpxActivity.filenameBelongsToList("1234567_query.zip"));
        assertTrue(importGpxActivity.filenameBelongsToList("12345678_query.zip"));
        assertTrue(importGpxActivity.filenameBelongsToList("12345678_my_query_1.zip"));
        assertTrue(importGpxActivity.filenameBelongsToList("12345678_my query.zip"));

        assertFalse(importGpxActivity.filenameBelongsToList("1234567.gpy"));
        assertFalse(importGpxActivity.filenameBelongsToList("1234567.agpx"));
        assertFalse(importGpxActivity.filenameBelongsToList("1234567"));
        assertFalse(importGpxActivity.filenameBelongsToList(""));
        assertFalse(importGpxActivity.filenameBelongsToList("gpx"));
        assertFalse(importGpxActivity.filenameBelongsToList("test.zip"));
        assertFalse(importGpxActivity.filenameBelongsToList("zip"));
        assertFalse(importGpxActivity.filenameBelongsToList(".zip"));
        assertFalse(importGpxActivity.filenameBelongsToList("123456.zip"));
        assertFalse(importGpxActivity.filenameBelongsToList("1234567query.zip"));
        assertFalse(importGpxActivity.filenameBelongsToList("1234567_.zip"));

        assertFalse(importGpxActivity.filenameBelongsToList("1234567-wpts.gpx"));
    }

}
