package hw13DynamicXpath;

public class UseOfXpath {
	
	//9 ways of using Xpath locator
	
	/*1] Tag with a single attribute
	 * 
	 * Formula: //htmltag[@attributeName='attributeValue']
	 * Source: https://www.gamestop.com
	 * Examples:
	 * i) gamestop logo--> //img[@class='nav-logo']
	 * 
	 * ii) sign in button--> //span[@class='user-message-redesign check-none d-block sign-in-label-col']
	 * 
	 * iii) menu button--> //span[@class='hamburger-icon-redesign material-icons']
	 * 
	 * iv) check an order button--> //a[@class='check-an-order-link']
	 * 
	 * v) trade in button--> //span[@class='d-block tradein-block']
	 * 
	 * ------------------------------------------------------
	 * 
	 * 2] Tag with multiple attribute with 'or' logic
	 * 
	 * Formula: //htmltag[@attributeName='attributeValue' or @attribute name = 'attribute value']
	 * Source: https:https: //www.yahoo.com
	 * Examples:
	 * i) search field--> //input[@class='_yb_slc6p' or @name='p']
	 * 
	 * ii) notification icon--> \n
	 * - //label[@for='ybarNotificationMenu' or @class='rapid-nonanchor-lt ybar-icon-sprite _yb_nz5z7 _yb_vjqc3']
	 * 
	 * iii) search submit button--> //input[@id='ybar-search' or @class='rapid-noclick-resp _yb_1mspi']
	 * 
	 * iv) politics button--> //span[@id='stream-filter-display-name-0' or @class='stream-filter-display-name O(n) O(auto):fv']
	 *
	 * v) yahoo logo--> \n 
	 * - //img[@class='_yb_1lt6g _yb_g9gf5 _yb_kwy1a' or @src='https://s.yimg.com/rz/p/yahoo_homepage_en-US_s_f_p_bestfit_homepage.png']
	 * 
	 * ------------------------------------------------------
	 * 
	 * 3] Tag with multiple attribute with 'and' logic
	 * 
	 * Formula: //html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']
	 * Source: https://new.mta.info
	 * Examples:
	 * i) plan a trip 'to' field bar-->//input[@id='edit-dest' and @name='edit-dest-search']
	 *
	 * ii) plan my trip button--> //button[@id='edit-submit' and @name='op']
	 * 
	 * iii) favorites star icon--> //a[@id='button-favorites' and @class='tab-favorites']
	 *
	 * iv) subway icon--> //a[@id='button-subway' and @class='tab-subway']
	 * 
	 * v) bus icon--> //a[@id='button-bus' and @class='tab-bus']
	 * 
	 *  ------------------------------------------------------
	 *  
	 *  4] Tag with inner text [means complete text]
	 *  
	 *  Formula: //html tag [text() = 'inner text']
	 *  Source: https://www.xfinity.com/overview
	 *  Examples:
	 *  i) my account button--> //a[text() = 'My Account']
	 * 
	 *  ii) My Xfinity button--> //a[text() = 'My Xfinity']
	 *  
	 *  iii) sign in butt--> //a[text() = 'Sign In' and @class='xc-header--signin-link']--(also this is ok)
	 *  
	 *  iv) Explore supersonic WiFi butt--> //a[text() = 'Explore supersonic WiFi']
	 *  
	 *  v) Find my deal butt--> //a[text() = 'Find my deal']
	 *  
	 *  ------------------------------------------------------
	 *  
	 *  5] Tag with inner text [not complete inner text rather partial text as well as actual text]
	 *  
	 *  Formula: //html tag[contains(text(), 'partial or complete inner text value')]
	 *  Source: https://www.xfinity.com/overview
	 *  Examples:
	 *  i) my TV & Streaming button--> //a[contains(text(), 'TV &')]
	 *  
	 *  ii) Shop samsung button--> //a[contains(text(), 'Shop S')]
	 *  
	 *  iii) Explore supersonic WiFi butt--> //a[contains(text(), 'Ex')]
	 * 
	 *  iv) Find my deal butt--> //a[contains(text(), 'Find m')]
	 *  
	 *  v) Shop all plans butt--> //a[contains(text(), 'Shop a')]
	 *  
	 *  ------------------------------------------------------
	 *  
	 *  6] Tag with attributes and use of contains{partial or all}
	 *  Formula: //html tag [contains(@attribute, 'attribute value')]
	 *  Source: https://www.ign.com
	 *  Examples:--> In i) i show difference of partial attribute value from all of it
	 *  i) ign logo {partial is--> //a[contains(@class, 'lo')]  { full is-->//a[contains(@class, 'logo-link')]
	 *  
	 *  ii) search button--> //button[contains(@class, 'jsx-1599603317 button jsx-3055379759 icon-button s')]
	 *  
	 *  iii) everything today persona 5 img-->//img[contains(@src, 'https://assets1.ignimgs.com/2022/06/28/p')]
	 *  
	 *  iv) reviews index--> //a[contains(@href, '/review')]
	 *  
	 *  v) playlist index--> //a[contains(@href, '/playl')]
	 *  
	 *  ------------------------------------------------------
	 *  
	 *  7] Normalize space -- eliminates leading and trailing spaces
	 *  Formula: //html tag [normalize-space(text())='attribute value']
	 *  Source: https://www.montefiore.org
	 *  Examples:
	 *  i) pg bottom Locations, Directions and Parking--> //a[normalize-space(text())='Locations, Directions and Parking']
	 *  
	 *  ii) pg bottom Find a Doctor--> //a[normalize-space(text())='Find a Doctor']
	 * 
	 *  iii) pg bottom Information for Patients--> //a[normalize-space(text())='Information for Patients']
	 *  
	 *  iv) pg bottom Partnership with Einstein--> //a[normalize-space(text())='Partnership with Einstein']
	 * 
	 *  v) pg bottom Events--> //a[normalize-space(text())='Events']
	 *  
	 *  ------------------------------------------------------
	 *  
	 *  8]  Starts with text
	 *  
	 *  Formula://html tag [starts-with(text(), 'attribute value')] --> can be full or partial value
	 *  Source: https://www.nycgo.com/things-to-do
	 *  Examples:
	 *  i) things to do intro--> //p[starts-with(text(), 'No')]
	 *  
	 *  ii) Attractions pgh--> //p[starts-with(text(), 'Breath')]
	 *  
	 *  iii) Events pgh--> //p[starts-with(text(), 'Some')]
	 *  
	 *  iv) Broadway show pgh--> //p[starts-with(text(), 'Broadway')]
	 *  
	 *  v) Restaurants pgh--//p[starts-with(text(), 'Your eating')]
	 *  
	 *  ------------------------------------------------------
	 *  
	 *  9] Starts with attribute
	 *  
	 *  Formula: //html tag [starts-with(@attributes, 'attribute value')]
	 *  Source: https://www.bestbuy.com
	 *  Examples:
	 *  i) burger menu--> //nav[starts-with(@class, 'hamburger-menu')]
	 *  
	 *  ii) search field--> //input[starts-with(@id, 'gh-search-input')]
	 *  
	 *  iii) outlet deals button--> //a[starts-with(@class, 'outlet-deals-badge v-bg-human-blue px-100')]
	 *  
	 *  iv) Cart link--> //span[starts-with(@class, 'cart-label')]
	 *  
	 *  v) Curbside Pickup img--> //img[starts-with(@alt, 'Curbside Pickup')]
	 */

}
