/**
Copyright homeblackbox project to represent
All right reserved.
*/

package com.dd.contact.sync.db.model;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public class EventData {
    private String mEventType;
    private String mEventStartDate;
    /**
     * Method getmEventType.
    
     * @return String */
    public String getmEventType() {
        return mEventType;
    }
    /**
     * Method setmEventType.
     * @param mEventType String
     */
    public void setmEventType(String mEventType) {
        this.mEventType = mEventType;
    }
    /**
     * Method getmEventStartDate.
    
     * @return String */
    public String getmEventStartDate() {
        return mEventStartDate;
    }
    /**
     * Method setmEventStartDate.
     * @param mEventStartDate String
     */
    public void setmEventStartDate(String mEventStartDate) {
        this.mEventStartDate = mEventStartDate;
    }
}
