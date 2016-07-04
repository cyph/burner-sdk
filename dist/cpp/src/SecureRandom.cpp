#include <hxcpp.h>

#ifndef INCLUDED_SecureRandom
#include <SecureRandom.h>
#endif
#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io_Input
#include <haxe/io/Input.h>
#endif
#ifndef INCLUDED_sys_io_File
#include <sys/io/File.h>
#endif
#ifndef INCLUDED_sys_io_FileInput
#include <sys/io/FileInput.h>
#endif

Void SecureRandom_obj::__construct()
{
	return null();
}

//SecureRandom_obj::~SecureRandom_obj() { }

Dynamic SecureRandom_obj::__CreateEmpty() { return  new SecureRandom_obj; }
hx::ObjectPtr< SecureRandom_obj > SecureRandom_obj::__new()
{  hx::ObjectPtr< SecureRandom_obj > _result_ = new SecureRandom_obj();
	_result_->__construct();
	return _result_;}

Dynamic SecureRandom_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< SecureRandom_obj > _result_ = new SecureRandom_obj();
	_result_->__construct();
	return _result_;}

::haxe::io::Bytes SecureRandom_obj::getSecureRandomBytes( int length){
	HX_STACK_FRAME("SecureRandom","getSecureRandomBytes",0xfc5b05af,"SecureRandom.getSecureRandomBytes","SecureRandom.hx",11,0xab554504)
	HX_STACK_ARG(length,"length")
	HX_STACK_LINE(12)
	::String reason = HX_HCSTRING("","\x00","\x00","\x00","\x00");		HX_STACK_VAR(reason,"reason");
	HX_STACK_LINE(13)
	try
	{
	HX_STACK_CATCHABLE(Dynamic, 0);
	{
		HX_STACK_LINE(35)
		int tmp = length;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(35)
		::haxe::io::Bytes tmp1 = ::haxe::io::Bytes_obj::alloc(tmp);		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(35)
		::haxe::io::Bytes out = tmp1;		HX_STACK_VAR(out,"out");
		HX_STACK_LINE(39)
		::sys::io::FileInput tmp2 = ::sys::io::File_obj::read(HX_HCSTRING("/dev/urandom","\xef","\x12","\xd0","\xba"),null());		HX_STACK_VAR(tmp2,"tmp2");
		HX_STACK_LINE(39)
		::sys::io::FileInput input = tmp2;		HX_STACK_VAR(input,"input");
		HX_STACK_LINE(41)
		::haxe::io::Bytes tmp3 = out;		HX_STACK_VAR(tmp3,"tmp3");
		HX_STACK_LINE(41)
		int tmp4 = length;		HX_STACK_VAR(tmp4,"tmp4");
		HX_STACK_LINE(41)
		input->readBytes(tmp3,(int)0,tmp4);
		HX_STACK_LINE(42)
		input->close();
		HX_STACK_LINE(43)
		::haxe::io::Bytes tmp5 = out;		HX_STACK_VAR(tmp5,"tmp5");
		HX_STACK_LINE(43)
		return tmp5;
	}
	}
	catch(Dynamic __e){
		{
			HX_STACK_BEGIN_CATCH
			Dynamic e = __e;{
				HX_STACK_LINE(46)
				Dynamic tmp = e;		HX_STACK_VAR(tmp,"tmp");
				HX_STACK_LINE(46)
				::String tmp1 = ::Std_obj::string(tmp);		HX_STACK_VAR(tmp1,"tmp1");
				HX_STACK_LINE(46)
				::String tmp2 = (HX_HCSTRING("","\x00","\x00","\x00","\x00") + tmp1);		HX_STACK_VAR(tmp2,"tmp2");
				HX_STACK_LINE(46)
				reason = tmp2;
			}
		}
	}
	HX_STACK_LINE(48)
	::String tmp = (HX_HCSTRING("Can't find a secure source of random bytes. Reason: ","\xf4","\x9e","\xba","\xf6") + reason);		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(48)
	HX_STACK_DO_THROW(tmp);
	HX_STACK_LINE(48)
	return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(SecureRandom_obj,getSecureRandomBytes,return )


SecureRandom_obj::SecureRandom_obj()
{
}

bool SecureRandom_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 20:
		if (HX_FIELD_EQ(inName,"getSecureRandomBytes") ) { outValue = getSecureRandomBytes_dyn(); return true;  }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(SecureRandom_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(SecureRandom_obj::__mClass,"__mClass");
};

#endif

hx::Class SecureRandom_obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("getSecureRandomBytes","\xbb","\x8e","\x20","\x34"),
	::String(null()) };

void SecureRandom_obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("SecureRandom","\xfa","\x75","\x84","\xba");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &SecureRandom_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< SecureRandom_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = sStaticStorageInfo;
#endif
	hx::RegisterClass(__mClass->mName, __mClass);
}

