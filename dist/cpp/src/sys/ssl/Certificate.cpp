// Generated by Haxe 3.4.7
#include <hxcpp.h>

#ifndef INCLUDED_Sys
#include <Sys.h>
#endif
#ifndef INCLUDED_sys_FileSystem
#include <sys/FileSystem.h>
#endif
#ifndef INCLUDED_sys_ssl_Certificate
#include <sys/ssl/Certificate.h>
#endif

HX_DEFINE_STACK_FRAME(_hx_pos_0462ffd2dbc17767_11_new,"sys.ssl.Certificate","new",0x5388a2e6,"sys.ssl.Certificate.new","/usr/share/haxe/std/cpp/_std/sys/ssl/Certificate.hx",11,0x0313ee10)
HX_LOCAL_STACK_FRAME(_hx_pos_00c96e576b0b6060_112___init__,"::sys::ssl::Certificate_obj","__init__",0x6779d94e,"::sys::ssl::Certificate_obj.__init__","/usr/share/haxe/std/cpp/_std/sys/ssl/Certificate.hx",112,0x0313ee10)
HX_LOCAL_STACK_FRAME(_hx_pos_0462ffd2dbc17767_17_loadFile,"sys.ssl.Certificate","loadFile",0xca3fe77c,"sys.ssl.Certificate.loadFile","/usr/share/haxe/std/cpp/_std/sys/ssl/Certificate.hx",17,0x0313ee10)
HX_LOCAL_STACK_FRAME(_hx_pos_0462ffd2dbc17767_21_loadPath,"sys.ssl.Certificate","loadPath",0xd0d5fea5,"sys.ssl.Certificate.loadPath","/usr/share/haxe/std/cpp/_std/sys/ssl/Certificate.hx",21,0x0313ee10)
HX_LOCAL_STACK_FRAME(_hx_pos_0462ffd2dbc17767_28_loadDefaults,"sys.ssl.Certificate","loadDefaults",0xcc9e6992,"sys.ssl.Certificate.loadDefaults","/usr/share/haxe/std/cpp/_std/sys/ssl/Certificate.hx",28,0x0313ee10)
static const ::String _hx_array_data_323ff7f4_6[] = {
	HX_("/system/etc/security/cacerts",4e,e7,c9,0c),
};
static const ::String _hx_array_data_323ff7f4_7[] = {
	HX_("/usr/local/share/certs/ca-root-nss.crt",0b,8a,73,2d),HX_("/etc/ssl/cert.pem",7b,47,2d,85),HX_("/etc/openssl/certs/ca-certificates.crt",ab,93,b8,f7),
};
static const ::String _hx_array_data_323ff7f4_8[] = {
	HX_("/etc/ssl/certs/ca-certificates.crt",b5,ee,2f,00),HX_("/etc/pki/tls/certs/ca-bundle.crt",a9,8e,94,e3),HX_("/etc/ssl/ca-bundle.pem",2e,d2,dd,98),HX_("/etc/pki/tls/cacert.pem",ab,dc,00,7d),HX_("/etc/ssl/certs",c2,59,e5,3e),HX_("/system/etc/security/cacerts",4e,e7,c9,0c),
};
namespace sys{
namespace ssl{

void Certificate_obj::__construct( ::Dynamic x, ::sys::ssl::Certificate h){
            	HX_STACKFRAME(&_hx_pos_0462ffd2dbc17767_11_new)
HXLINE(  12)		this->_hx___x = x;
HXLINE(  13)		this->_hx___h = h;
            	}

Dynamic Certificate_obj::__CreateEmpty() { return new Certificate_obj; }

void *Certificate_obj::_hx_vtable = 0;

Dynamic Certificate_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Certificate_obj > _hx_result = new Certificate_obj();
	_hx_result->__construct(inArgs[0],inArgs[1]);
	return _hx_result;
}

bool Certificate_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x0b8db5f8;
}

void Certificate_obj::__init__(){
            	HX_STACKFRAME(&_hx_pos_00c96e576b0b6060_112___init__)
HXDLIN( 112)		_hx_ssl_init();
            	}


 ::sys::ssl::Certificate Certificate_obj::loadFile(::String file){
            	HX_GC_STACKFRAME(&_hx_pos_0462ffd2dbc17767_17_loadFile)
HXDLIN(  17)		return  ::sys::ssl::Certificate_obj::__alloc( HX_CTX ,_hx_ssl_cert_load_file(file),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Certificate_obj,loadFile,return )

 ::sys::ssl::Certificate Certificate_obj::loadPath(::String path){
            	HX_GC_STACKFRAME(&_hx_pos_0462ffd2dbc17767_21_loadPath)
HXDLIN(  21)		return  ::sys::ssl::Certificate_obj::__alloc( HX_CTX ,_hx_ssl_cert_load_path(path),null());
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Certificate_obj,loadPath,return )

 ::sys::ssl::Certificate Certificate_obj::loadDefaults(){
            	HX_GC_STACKFRAME(&_hx_pos_0462ffd2dbc17767_28_loadDefaults)
HXLINE(  29)		 ::Dynamic x = _hx_ssl_cert_load_defaults();
HXLINE(  30)		if (hx::IsNotNull( x )) {
HXLINE(  31)			return  ::sys::ssl::Certificate_obj::__alloc( HX_CTX ,x,null());
            		}
HXLINE(  33)		::Array< ::String > defPaths = null();
HXLINE(  34)		{
HXLINE(  34)			::String _g = ::Sys_obj::systemName();
HXDLIN(  34)			::String _hx_switch_0 = _g;
            			if (  (_hx_switch_0==HX_("Android",0f,c3,f5,69)) ){
HXLINE(  51)				defPaths = ::Array_obj< ::String >::fromData( _hx_array_data_323ff7f4_6,1);
HXDLIN(  51)				goto _hx_goto_3;
            			}
            			if (  (_hx_switch_0==HX_("BSD",53,5d,32,00)) ){
HXLINE(  45)				defPaths = ::Array_obj< ::String >::fromData( _hx_array_data_323ff7f4_7,3);
HXDLIN(  45)				goto _hx_goto_3;
            			}
            			if (  (_hx_switch_0==HX_("Linux",d4,5b,2f,08)) ){
HXLINE(  36)				defPaths = ::Array_obj< ::String >::fromData( _hx_array_data_323ff7f4_8,6);
HXDLIN(  36)				goto _hx_goto_3;
            			}
            			/* default */{
            			}
            			_hx_goto_3:;
            		}
HXLINE(  54)		if (hx::IsNotNull( defPaths )) {
HXLINE(  55)			int _g1 = (int)0;
HXDLIN(  55)			while((_g1 < defPaths->length)){
HXLINE(  55)				::String path = defPaths->__get(_g1);
HXDLIN(  55)				_g1 = (_g1 + (int)1);
HXLINE(  56)				if (::sys::FileSystem_obj::exists(path)) {
HXLINE(  57)					if (::sys::FileSystem_obj::isDirectory(path)) {
HXLINE(  58)						return ::sys::ssl::Certificate_obj::loadPath(path);
            					}
            					else {
HXLINE(  60)						return ::sys::ssl::Certificate_obj::loadFile(path);
            					}
            				}
            			}
            		}
HXLINE(  64)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Certificate_obj,loadDefaults,return )


Certificate_obj::Certificate_obj()
{
}

void Certificate_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Certificate);
	HX_MARK_MEMBER_NAME(_hx___h,"__h");
	HX_MARK_MEMBER_NAME(_hx___x,"__x");
	HX_MARK_END_CLASS();
}

void Certificate_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(_hx___h,"__h");
	HX_VISIT_MEMBER_NAME(_hx___x,"__x");
}

hx::Val Certificate_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"__h") ) { return hx::Val( _hx___h ); }
		if (HX_FIELD_EQ(inName,"__x") ) { return hx::Val( _hx___x ); }
	}
	return super::__Field(inName,inCallProp);
}

bool Certificate_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 8:
		if (HX_FIELD_EQ(inName,"loadFile") ) { outValue = loadFile_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"loadPath") ) { outValue = loadPath_dyn(); return true; }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"loadDefaults") ) { outValue = loadDefaults_dyn(); return true; }
	}
	return false;
}

hx::Val Certificate_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"__h") ) { _hx___h=inValue.Cast<  ::sys::ssl::Certificate >(); return inValue; }
		if (HX_FIELD_EQ(inName,"__x") ) { _hx___x=inValue.Cast<  ::Dynamic >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Certificate_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_HCSTRING("__h","\x48","\x69","\x48","\x00"));
	outFields->push(HX_HCSTRING("__x","\x58","\x69","\x48","\x00"));
	super::__GetFields(outFields);
};

#if HXCPP_SCRIPTABLE
static hx::StorageInfo Certificate_obj_sMemberStorageInfo[] = {
	{hx::fsObject /*::sys::ssl::Certificate*/ ,(int)offsetof(Certificate_obj,_hx___h),HX_HCSTRING("__h","\x48","\x69","\x48","\x00")},
	{hx::fsObject /*Dynamic*/ ,(int)offsetof(Certificate_obj,_hx___x),HX_HCSTRING("__x","\x58","\x69","\x48","\x00")},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Certificate_obj_sStaticStorageInfo = 0;
#endif

static ::String Certificate_obj_sMemberFields[] = {
	HX_HCSTRING("__h","\x48","\x69","\x48","\x00"),
	HX_HCSTRING("__x","\x58","\x69","\x48","\x00"),
	::String(null()) };

static void Certificate_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Certificate_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void Certificate_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Certificate_obj::__mClass,"__mClass");
};

#endif

hx::Class Certificate_obj::__mClass;

static ::String Certificate_obj_sStaticFields[] = {
	HX_HCSTRING("loadFile","\xc2","\x9f","\x5b","\xb4"),
	HX_HCSTRING("loadPath","\xeb","\xb6","\xf1","\xba"),
	HX_HCSTRING("loadDefaults","\xd8","\xbc","\x02","\x69"),
	::String(null())
};

void Certificate_obj::__register()
{
	hx::Object *dummy = new Certificate_obj;
	Certificate_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("sys.ssl.Certificate","\xf4","\xf7","\x3f","\x32");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &Certificate_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = Certificate_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(Certificate_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Certificate_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Certificate_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = Certificate_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Certificate_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Certificate_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

void Certificate_obj::__boot()
{
}

} // end namespace sys
} // end namespace ssl
