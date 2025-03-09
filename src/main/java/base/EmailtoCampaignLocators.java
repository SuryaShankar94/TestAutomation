package base;

import org.openqa.selenium.By;

public class EmailtoCampaignLocators {
    public static final By campaign = By.xpath("//span[@class='title'][starts-with(text(),'Campaign')]");
    public static final By createCampaign = By.xpath("//span[contains(text(),'Create Campaign')]");
    public static final By emailCampaign = By.xpath("//h4[contains(text(),'E-mail') and @class='txt_colors']");
    public static final By campaignName = By.xpath("//input[@id='campaignName']");
    public static final By description = By.xpath("//textarea[@name='description']");
    public static final By folderSelection = By.xpath("//select[@name='campaign.categoryId']");
    public static final By insertMergeTags = By.xpath("//button[@class='btn btn-default button-color']");
    public static final By mergeTagName = By.xpath("(//i[@class='fa fa-copy IconCustomization campaignViewIcon'])[5]");
    public static final By fromeMail = By.xpath("//select[@name='campaign.categoryId']");
    public static final By preHeader = By.xpath("//input[@id='preHeader']");
    public static final By viewinBrowser = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[1]");
    public static final By unsubscribeLink = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[2]");
    public static final By notifyEmailOpend = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[3]");
    public static final By notifyLinkOpned = By.xpath("(//span[@class='bootstrap-switch-handle-off bootstrap-switch-default'])[4]");
    public static final By sortEmailTemplate = By.xpath("//select[@id='select-dropdown']");
    public static final By searchBox = By.xpath("(//input[contains(@class,'form-control ng-') and @placeholder='Search here'])[1]");
    public static final By searchIcon = By.xpath("//button[@class='search-box-item-click email-search']");
    public static final By searchClearButton = By.xpath("//button[contains(@class,'glyphicon glyphicon-remove search-box-item-clear search-button-padding ng-tn')]");
    public static final By editTemplate = By.xpath("(//span[contains(@class,'label-color-custmization ng-t') and contains(text(),'Edit')])[1]");
    public static final By insertMergeTagsinTemplate = By.xpath("//span[@class='btn btn-primary transition' and contains(text(),'Merge')]");
    public static final By  closeMrgTagWindow = By.xpath("//button[@id='bottom-right']");
    public static final By saveTemplate = By.xpath("//span[contains(text(),'SAVE')]");
    public static final By closeTemplate = By.xpath("//a[contains(@class,'close-circle pull-right')]");
    public static final By filterButton = By.xpath("//i[contains(@class,'fa fa-filter cesf-xamp ng-tns-c') and @title='Apply Filter']");
    public static final By clickFolderFilter = By.xpath("//input[@class='e-dropdownbase']");
    public static final By selectFolder = By.xpath("//span[@title='automatedvendor-Default-Folder' and @class='e-chips']");
    public static final By applyFilter = By.xpath("//button[@class='btn btn-info' and contains(text(),'Apply')]");
    public static final By closeFilter = By.xpath("//button[@class='btn btn-danger' and contains(text(),'Clear')]");
    public static final By eMailTemplateNext = By.xpath("(//i[@class='fa fa-angle-right' and @title='Next'])[1]");
    public static final By eMailTemplateLast = By.xpath("(//i[@class='fa fa-angle-double-right' and @title='Last'])[1]");
    public static final By eMailTemplatePrevious = By.xpath("(//i[@class='fa fa-angle-left' and @title='Previous'])[1]");
    public static final By eMailTemplateFirst = By.xpath("(//i[@class='fa fa-angle-double-left' and @title='First'])[1]");
    public static final By eMailPaginationDrpDwn = By.xpath("(//select[contains(@class,'form-control margin-top pointer mt')])[1]");
    public static final By selecteMailTemplate = By.xpath("(//input[@class='radio-custimization pointer radioButton_shadow'])[1]");
    public static final By sendTesteMailButton = By.xpath("//button[contains(@class,'button_blue bgcolor-unset pd_top0 ng-tns-')]");
    public static final By entereMailAddress = By.xpath("//input[contains(@class,'form-control') and @placeholder='Please Enter Email Address']");
    public static final By sendTestButton = By.xpath("//span[contains(@class,'btn Btn-Green transition txt_pd-t') and contains(text(),'Send Test')]");
    public static final By emailSentSuccessOK = By.xpath("//button[@class='swal2-confirm styled']");
    public static final By nextButton = By.xpath("//button[contains(@class,'btn btn-primary pull-right')]");
    public static final By partnerGroupSelectionOrder = By.xpath("//select[contains(@class,'form-control cc mTopSort ng-untouched ng-pristine')]");
    public static final By searchPartnerGroup = By.xpath("(//input[contains(@class,'form-control ') and @placeholder='Search here'])[2]");
    public static final By searchPartnerGroupButton = By.xpath("//button[@class='search-box-item-click email-search search-icon-rp']");
    public static final By cancelSearchPartnerGroup = By.xpath("(//button[contains(@class,'glyphicon-remove search-box-item-clear search-button-padding')])");
    public static final By selectPartnerCheckBox = By.xpath("(//input[@class='chk pointer checkBox_shadow'])[2]");
    public static final By selctpartnerGroupPreview = By.xpath("(//i[@class='fa fa-eye IconCustomization campaignViewIcon'])[2]");
    public static final By closePartnerPreview = By.xpath("//button[@class='btn Btn-Gray' and contains(text(),'Close')]");
    public static final By partnerGroupFirst = By.xpath("(//i[@class='fa fa-angle-double-left' and @title='First'])[2]");
    public static final By partnerGroupLast = By.xpath("(//i[@class='fa fa-angle-double-right' and contains(@title,'Last')])[2]");
    public static final By partnerGroupNext = By.xpath("(//i[@class='fa fa-angle-right' and @title='Next'])[2]");
    public static final By partnerGroupPrevious = By.xpath("(//i[@class='fa fa-angle-left'])[2]");
    public static final By partnerPaginationDrpDwn = By.xpath("(//select[contains(@class,'form-control margin-top pointer mt')])[2]");
    public static final By launchNow = By.xpath("//input[contains(@id,'launch-option') and @value='NOW']");
    public static final By launchSave = By.xpath("//input[contains(@id,'launch-option') and @value='SAVE']");
    public static final By launchShedule = By.xpath("//input[contains(@id,'launch-option') and @value='SCHEDULE']");
    public static final By sendTestMail = By.xpath("//span[contains(@class,'btn Btn-Green transition pl_4 pos_pd-top') and contains(text(),'Send Test Email')]");
    public static final By eMailAddress = By.xpath("(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid')])[6]");
    public static final By saveButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-top') and contains(text(),'Save')]");
    public static final By sheduleButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-top') and contains(text(),'Schedule')]");
    public static final By sheduleLaunchTime = By.xpath("//input[@id='launchTime']");
    public static final By sheduleDate = By.xpath("(//div[contains(@class,'flatpickr-calendar hasTime animate ')]//div[@class='dayContainer']//span[@class='flatpickr-day '])[132]");
    /// ///////////////////////////////////////////////////////////////////////////////////////////
    //public static final By sheduleDate = By.xpath("((//div[contains(@class,'flatpickr-calendar hasTime animate ')]//div[@class='dayContainer']//span[@class='flatpickr-day today selected']))");
    //public static final By sheduleTime = By.xpath("(//div[@class='flatpickr-calendar hasTime animate arrowTop showTimeInput open']//div[@class='flatpickr-time']//div[contains(@class,'numInputWrapper')]//span[@class='arrowUp'])[1]");
    /// //////////////////////////////////////////////////////////////////////////////////////
    public static final By sheduleCountry = By.xpath("//select[@id='countryName']");
    public static final By spamCheck = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd') and contains(text(),'Spam')]");
    public static final By innerSpamCheck = By.xpath("//span[contains(@class,'btn btn-primary transition txt_pd-t') and contains(text(),'Spam')]");
    public static final By refresh = By.xpath("//a[contains(@class,'btn btn-success btn-xs') and contains(text(),'Refresh')]");
    public static final By closeSpamCheck = By.xpath("(//a[contains(@class,'Btn-Gray') and contains(text(),'Close')])[2]");
    public static final By launchButton = By.xpath("//span[contains(@class,'btn Btn-Green transition pos_pd-to') and contains(text(),'Launch')]");
    public static final By previousButton = By.xpath("//span[contains(@class,'btn Btn-Gray') and contains(text(),'Previous')]");
    //public static final By a = By.xpath("");

}
