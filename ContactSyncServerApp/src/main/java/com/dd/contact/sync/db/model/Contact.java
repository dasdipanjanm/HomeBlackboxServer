/**
Copyright homeblackbox project to represent
All right reserved.
*/
package com.dd.contact.sync.db.model;

import java.util.List;

/**
 * @author DIPANJAN
 *
 * @version $Revision: 1.0 $
 */
public class Contact {
    private String mContactId;
    private String mContcatImage;
    private String mNickname;
    private String mContactName;
    private List<OrganizationData> mOrganizationDataList;
    private List<WebSiteData> mWebSiteDataList;
    private List<RelationData> mRelationDataList;
    private List<EmailData> mEmailDataList;
    private List<PhoneNumberData> mPhoneNumberDataList;
    private List<ContactNote> mContactNoteList;
    private List<SipCall> mSipCallList;
    private List<ContactName> mContactNameList;
    private List<StructuredPostal> mStructuredPostalList;
    private List<ContactIMData> mContactIMDataList;
    private List<EventData> mEventDataList;
    /**
     * Method getmContactId.
     * @return String
     */
    public String getmContactId() {
        return mContactId;
    }
    /**
     * Method setmContactId.
     * @param mContactId String
     */
    public void setmContactId(String mContactId) {
        this.mContactId = mContactId;
    }
    /**
     * Method getmContcatImage.
     * @return String
     */
    public String getmContcatImage() {
        return mContcatImage;
    }
    /**
     * Method setmContcatImage.
     * @param mContcatImage String
     */
    public void setmContcatImage(String mContcatImage) {
        this.mContcatImage = mContcatImage;
    }
    /**
     * Method getmNickname.
     * @return String
     */
    public String getmNickname() {
        return mNickname;
    }
    /**
     * Method setmNickname.
     * @param mNickname String
     */
    public void setmNickname(String mNickname) {
        this.mNickname = mNickname;
    }
    /**
     * Method getmContactName.
     * @return String
     */
    public String getmContactName() {
        return mContactName;
    }
    /**
     * Method setmContactName.
     * @param mContactName String
     */
    public void setmContactName(String mContactName) {
        this.mContactName = mContactName;
    }
    /**
     * Method getmOrganizationDataList.
     * @return List<OrganizationData>
     */
    public List<OrganizationData> getmOrganizationDataList() {
        return mOrganizationDataList;
    }
    /**
     * Method setmOrganizationDataList.
     * @param mOrganizationDataList List<OrganizationData>
     */
    public void setmOrganizationDataList(
            List<OrganizationData> mOrganizationDataList) {
        this.mOrganizationDataList = mOrganizationDataList;
    }
    /**
     * Method getmWebSiteDataList.
     * @return List<WebSiteData>
     */
    public List<WebSiteData> getmWebSiteDataList() {
        return mWebSiteDataList;
    }
    /**
     * Method setmWebSiteDataList.
     * @param mWebSiteDataList List<WebSiteData>
     */
    public void setmWebSiteDataList(List<WebSiteData> mWebSiteDataList) {
        this.mWebSiteDataList = mWebSiteDataList;
    }
    /**
     * Method getmRelationDataList.
     * @return List<RelationData>
     */
    public List<RelationData> getmRelationDataList() {
        return mRelationDataList;
    }
    /**
     * Method setmRelationDataList.
     * @param mRelationDataList List<RelationData>
     */
    public void setmRelationDataList(List<RelationData> mRelationDataList) {
        this.mRelationDataList = mRelationDataList;
    }
    /**
     * Method getmEmailDataList.
     * @return List<EmailData>
     */
    public List<EmailData> getmEmailDataList() {
        return mEmailDataList;
    }
    /**
     * Method setmEmailDataList.
     * @param mEmailDataList List<EmailData>
     */
    public void setmEmailDataList(List<EmailData> mEmailDataList) {
        this.mEmailDataList = mEmailDataList;
    }
    /**
     * Method getmPhoneNumberDataList.
     * @return List<PhoneNumberData>
     */
    public List<PhoneNumberData> getmPhoneNumberDataList() {
        return mPhoneNumberDataList;
    }
    /**
     * Method setmPhoneNumberDataList.
     * @param mPhoneNumberDataList List<PhoneNumberData>
     */
    public void setmPhoneNumberDataList(List<PhoneNumberData> mPhoneNumberDataList) {
        this.mPhoneNumberDataList = mPhoneNumberDataList;
    }
    /**
     * Method getmContactNoteList.
     * @return List<ContactNote>
     */
    public List<ContactNote> getmContactNoteList() {
        return mContactNoteList;
    }
    /**
     * Method setmContactNoteList.
     * @param mContactNoteList List<ContactNote>
     */
    public void setmContactNoteList(List<ContactNote> mContactNoteList) {
        this.mContactNoteList = mContactNoteList;
    }
    /**
     * Method getmSipCallList.
     * @return List<SipCall>
     */
    public List<SipCall> getmSipCallList() {
        return mSipCallList;
    }
    /**
     * Method setmSipCallList.
     * @param mSipCallList List<SipCall>
     */
    public void setmSipCallList(List<SipCall> mSipCallList) {
        this.mSipCallList = mSipCallList;
    }
    /**
     * Method getmContactNameList.
     * @return List<ContactName>
     */
    public List<ContactName> getmContactNameList() {
        return mContactNameList;
    }
    /**
     * Method setmContactNameList.
     * @param mContactNameList List<ContactName>
     */
    public void setmContactNameList(List<ContactName> mContactNameList) {
        this.mContactNameList = mContactNameList;
    }
    /**
     * Method getmStructuredPostalList.
     * @return List<StructuredPostal>
     */
    public List<StructuredPostal> getmStructuredPostalList() {
        return mStructuredPostalList;
    }
    /**
     * Method setmStructuredPostalList.
     * @param mStructuredPostalList List<StructuredPostal>
     */
    public void setmStructuredPostalList(
            List<StructuredPostal> mStructuredPostalList) {
        this.mStructuredPostalList = mStructuredPostalList;
    }
    /**
     * Method getmContactIMDataList.
     * @return List<ContactIMData>
     */
    public List<ContactIMData> getmContactIMDataList() {
        return mContactIMDataList;
    }
    /**
     * Method setmContactIMDataList.
     * @param mContactIMDataList List<ContactIMData>
     */
    public void setmContactIMDataList(List<ContactIMData> mContactIMDataList) {
        this.mContactIMDataList = mContactIMDataList;
    }
    /**
     * Method getmEventDataList.
     * @return List<EventData>
     */
    public List<EventData> getmEventDataList() {
        return mEventDataList;
    }
    /**
     * Method setmEventDataList.
     * @param mEventDataList List<EventData>
     */
    public void setmEventDataList(List<EventData> mEventDataList) {
        this.mEventDataList = mEventDataList;
    }
    
}
