// Generated by Haxe 3.4.7
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

HX_LOCAL_STACK_FRAME(_hx_pos_13b311a82c150aec_13_getSecureRandomBytes,"SecureRandom","getSecureRandomBytes",0xfc5b05af,"SecureRandom.getSecureRandomBytes","SecureRandom.hx",13,0xab554504)

void SecureRandom_obj::__construct() { }

Dynamic SecureRandom_obj::__CreateEmpty() { return new SecureRandom_obj; }

void *SecureRandom_obj::_hx_vtable = 0;

Dynamic SecureRandom_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< SecureRandom_obj > _hx_result = new SecureRandom_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool SecureRandom_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x38e682c2;
}

 ::haxe::io::Bytes SecureRandom_obj::getSecureRandomBytes(int length){
            	HX_STACKFRAME(&_hx_pos_13b311a82c150aec_13_getSecureRandomBytes)
HXLINE(  14)		::String reason = HX_("",00,00,00,00);
HXLINE(  15)		try {
            			HX_STACK_CATCHABLE( ::Dynamic, 0);
HXLINE(  38)			 ::haxe::io::Bytes out = ::haxe::io::Bytes_obj::alloc(length);
HXLINE(  42)			 ::sys::io::FileInput input = ::sys::io::File_obj::read(HX_("/dev/urandom",ef,12,d0,ba),null());
HXLINE(  44)			input->readBytes(out,(int)0,length);
HXLINE(  45)			input->close();
HXLINE(  46)			return out;
            		}
            		catch( ::Dynamic _hx_e){
            			if (_hx_e.IsClass<  ::Dynamic >() ){
            				HX_STACK_BEGIN_CATCH
            				 ::Dynamic e = _hx_e;
HXLINE(  49)				reason = (HX_("",00,00,00,00) + ::Std_obj::string(e));
            			}
            			else {
            				HX_STACK_DO_THROW(_hx_e);
            			}
            		}
HXLINE(  51)		HX_STACK_DO_THROW((HX_("Can't find a secure source of random bytes. Reason: ",f4,9e,ba,f6) + reason));
HXDLIN(  51)		return null();
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(SecureRandom_obj,getSecureRandomBytes,return )


SecureRandom_obj::SecureRandom_obj()
{
}

bool SecureRandom_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 20:
		if (HX_FIELD_EQ(inName,"getSecureRandomBytes") ) { outValue = getSecureRandomBytes_dyn(); return true; }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *SecureRandom_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *SecureRandom_obj_sStaticStorageInfo = 0;
#endif

static void SecureRandom_obj_sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(SecureRandom_obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void SecureRandom_obj_sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(SecureRandom_obj::__mClass,"__mClass");
};

#endif

hx::Class SecureRandom_obj::__mClass;

static ::String SecureRandom_obj_sStaticFields[] = {
	HX_HCSTRING("getSecureRandomBytes","\xbb","\x8e","\x20","\x34"),
	::String(null())
};

void SecureRandom_obj::__register()
{
	hx::Object *dummy = new SecureRandom_obj;
	SecureRandom_obj::_hx_vtable = *(void **)dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("SecureRandom","\xfa","\x75","\x84","\xba");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &SecureRandom_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = SecureRandom_obj_sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(SecureRandom_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< SecureRandom_obj >;
#ifdef HXCPP_VISIT_ALLOCS
	__mClass->mVisitFunc = SecureRandom_obj_sVisitStatics;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = SecureRandom_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = SecureRandom_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

