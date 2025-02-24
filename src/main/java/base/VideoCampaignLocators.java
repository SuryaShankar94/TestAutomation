package base;

import org.openqa.selenium.By;

public class VideoCampaignLocators {
    public static final By campaign = By.xpath("//span[@class='title'][starts-with(text(),'Campaign')]");
    public static final By createCampaign = By.xpath("//span[contains(text(),'Create Campaign')]");
    public static final By videoCampaign = By.xpath("//h4[@class='txt_colors'][contains(text(),'Video')]");
    public static final By campaignName = By.xpath("//input[@id='campaignName']");
    public static final By description = By.xpath("//textarea[@name='description']");
    public static final By fromMail = By.xpath("//select[@name='campaign.email']");
    public static final By insertMergeTags = By.xpath("//button[@class='btn btn-default button-color']");
    public static final By mergeTagName = By.xpath("(//a[@class='custom-icon'])[3]");
    public static final By preHeader = By.xpath("//input[@id='preHeader']");
    public static final By notifyeMailOpen = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[1]");
    public static final By notifyLinkOpned = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[2]");
    public static final By notifyVideoPlayed = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[3]");
    public static final By throughPartner = By.xpath("//span[@class='bootstrap-switch-handle-off bootstrap-switch-success']");
    public static final By sortSelectVideoCamp = By.xpath("(//select[@id='select-dropdown'])[1]");
    public static final By videoNext = By.xpath("(//i[@class='fa fa-angle-right' and contains(@title,'Next')])[1]");
    public static final By videoLast = By.xpath("(//i[@class='fa fa-angle-double-right' and contains(@title,'Last')])[1]");
    public static final By videoPrevious = By.xpath("(//i[@class='fa fa-angle-left'])[1]");
    public static final By videoFirst = By.xpath("(//i[@class='fa fa-angle-double-left' and @title='First'])[1]");
    public static final By selectVideoCategoryDrpDwn = By.xpath("//select[@class='select_filter form-control']");
    public static final By videoPagenationDrpDwn = By.xpath("(//select[@class='form-control margin-top pointer mt_10 ng-untouched ng-pristine ng-valid'])[1]");
    public static final By eMailTemplateNext = By.xpath("(//i[@class='fa fa-angle-right' and contains(@title,'Next')])[2]");
    public static final By eMailTemplateLast = By.xpath("(//i[@class='fa fa-angle-double-right' and contains(@title,'Last')])[2]");
    public static final By eMailTemplatePrevious = By.xpath("(//i[@class='fa fa-angle-left'])[2]");
    public static final By eMailTemplateFirst = By.xpath("(//i[@class='fa fa-angle-double-left' and @title='First'])[2]");
    public static final By eMailPaginationDrpDwn = By.xpath("(//select[@class='form-control margin-top pointer mt_10 ng-untouched ng-pristine ng-valid'])[2]");
    public static final By searchSelectVideoCamp = By.xpath("(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid') and @placeholder='Search here'])[1]");
    public static final By searchSelectVideoCampButton = By.xpath("(//button[@type='submit' and @class='search-box-item-click email-search'])[1]");
    public static final By searchClearVideoCampButton = By.xpath("//button[contains(@class,'glyphicon glyphicon-remove search-box-item-clear search-button-paddin')]");
    public static final By selectVideoRadioButton = By.xpath("(//input[@name='videoFileId'])[1]");
    public static final By sortSelecteMailTemplate = By.xpath("(//select[@id='select-dropdown'])[2]");
    public static final By clickFilterButton = By.xpath("//i[contains(@class,'fa fa-filter cesf-xamp ng-tns-c')]");
    public static final By applyFilter = By.xpath("//input[contains(@class,'e-dropdownbase')]");
    public static final By selectFolderFilter = By.xpath("//option[contains(text(),'automatedvendor-Default-Folder')]");
    public static final By filterClearButton = By.xpath("//button[@class='btn btn-danger']");
    public static final By filterApplyButton = By.xpath("//button[@class='btn btn-info']");
    public static final By searchSelecteMailTemplate = By.xpath("(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid') and @placeholder='Search here'])[2]");
    public static final By searchSelecteMailTemplateButton = By.xpath("(//button[@type='submit' and @class='search-box-item-click email-search'])[2]");
    public static final By selectSearchemailTemplate = By.xpath("(//img[@class='img-grid-track'])[1]");
    public static final By searchCleareMailTemplate = By.xpath("//button[contains(@class,'glyphicon glyphicon-remove search-box-item-clear search-button-paddin')]");
    public static final By sendTestMailButton = By.xpath("//button[contains(@class,'button_blue bgcolor-unset pd_top0 ng-tns')]");
    public static final By entereMailAddress = By.xpath("//input[contains(@class,'form-control ng') and @placeholder='Please Enter Email Address']");
    public static final By sendTestButton = By.xpath("//span[contains(@class,'btn Btn-Green transition txt_pd-t') and contains(text(),'Send Test')]");
    public static final By closeTestMailWindow = By.xpath("//button[contains(@class,'btn Btn-Gray neg_mrg_top') and contains(text(),'Close')]");
    public static final By emailSentSuccessOK = By.xpath("//button[@class='swal2-confirm styled']");
    public static final By nextButton = By.xpath("//button[contains(@class,'btn btn-primary pull-right')]");
    public static final By partnerGroupSelectionOrder = By.xpath("//select[contains(@class,'form-control cc mTopSort ng-untouched ng-pristine')]");
    public static final By searchPartnerGroup = By.xpath("(//input[contains(@class,'form-control ') and @placeholder='Search here'])[3]");
    public static final By searchPartnerGroupButton = By.xpath("//button[@class='search-box-item-click email-search search-icon-rp']");
    public static final By cancelSearchPartnerGroup = By.xpath("//button[contains(@class,'glyphicon-remove search-box-item-clear search-button-padding')]");
    public static final By selectPartnerCheckBox = By.xpath("(//input[@class='chk pointer checkBox_shadow'])[2]");
    public static final By selctpartnerGroupPreview = By.xpath("(//i[@class='fa fa-eye IconCustomization campaignViewIcon'])[2]");
    public static final By closePartnerPreview = By.xpath("//button[@class='btn Btn-Gray' and contains(text(),'Close')]");
    public static final By partnerGroupFirst = By.xpath("(//i[@class='fa fa-angle-double-left' and @title='First'])[3]");
    public static final By partnerGroupLast = By.xpath("(//i[@class='fa fa-angle-double-right' and contains(@title,'Last')])[3]");
    public static final By partnerGroupNext = By.xpath("(//i[@class='fa fa-angle-right' and @data-placement='bottom'])[3]");
    public static final By partnerGroupPrevious = By.xpath("(//i[@class='fa fa-angle-left'])[3]");
    public static final By partnerPaginationDrpDwn = By.xpath("(//select[@class='form-control margin-top pointer mt_10 ng-untouched ng-pristine ng-valid'])[3]");
    public static final By autoResponseWebsite = By.xpath("(//i[@class='fa fa-plus-square p0 workflow-icon-style'])[1]");
    public static final By autoResponseeMail = By.xpath("(//i[@class='fa fa-plus-square p0 workflow-icon-style'])[2]");
    public static final By whenToSendMail = By.xpath("//select[@id='url-schedule-type']");
    public static final By webSiteMsgBody = By.xpath("cke_editable cke_editable_themed cke_contents_ltr cke_show_borders");
    public static final By mailReason = By.xpath("//select[@name='actionId']");
    public static final By launchNow = By.xpath("//input[contains(@id,'launch-option') and @value='NOW']");
    public static final By launchSave = By.xpath("//input[contains(@id,'launch-option') and @value='SAVE']");
    public static final By launchShedule = By.xpath("//input[contains(@id,'launch-option') and @value='SCHEDULE']");
    public static final By eMailAddress = By.xpath("(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid')])[8]");
    public static final By saveButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-top') and contains(text(),'Save')]");
    public static final By sheduleButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-top') and contains(text(),'Schedule')]");
    public static final By sheduleLaunchTime = By.xpath("//input[@id='launchTime']");
    public static final By sheduleDate = By.xpath("(//div[contains(@class,'flatpickr-calendar hasTime animate showTimeInput open arrow')]//div[@class='dayContainer']//span[@class='flatpickr-day '])[26]");
    public static final By sheduleCountry = By.xpath("//select[@id='countryName']");
    public static final By spamCheck = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd') and contains(text(),'Spam')]");
    public static final By innerSpamCheck = By.xpath("//span[contains(@class,'btn btn-primary transition txt_pd-t') and contains(text(),'Spam')]");
    public static final By refresh = By.xpath("//a[contains(@class,'btn btn-success btn-xs') and contains(text(),'Refresh')]");
    public static final By closeSpamCheck = By.xpath("(//a[contains(@class,'Btn-Gray') and contains(text(),'Close')])[2]");
    public static final By launchButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-to') and contains(text(),'Launch')]");
    public static final By previousButton = By.xpath("//span[contains(@class,'btn Btn-Gray') and contains(text(),'Previous')]");
    public static final By sendTestMail = By.xpath("//span[contains(@class,'btn Btn-Green transition pl_4 pos_pd-top') and contains(text(),'Send Test Email')]");
//
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");
//    public static final By a = By.xpath("");

}
