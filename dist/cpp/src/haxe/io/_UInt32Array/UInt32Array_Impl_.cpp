#include <hxcpp.h>

#ifndef INCLUDED_haxe_io_ArrayBufferViewImpl
#include <haxe/io/ArrayBufferViewImpl.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif
#ifndef INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_
#include <haxe/io/_ArrayBufferView/ArrayBufferView_Impl_.h>
#endif
#ifndef INCLUDED_haxe_io__UInt32Array_UInt32Array_Impl_
#include <haxe/io/_UInt32Array/UInt32Array_Impl_.h>
#endif
namespace haxe{
namespace io{
namespace _UInt32Array{

Void UInt32Array_Impl__obj::__construct()
{
	return null();
}

//UInt32Array_Impl__obj::~UInt32Array_Impl__obj() { }

Dynamic UInt32Array_Impl__obj::__CreateEmpty() { return  new UInt32Array_Impl__obj; }
hx::ObjectPtr< UInt32Array_Impl__obj > UInt32Array_Impl__obj::__new()
{  hx::ObjectPtr< UInt32Array_Impl__obj > _result_ = new UInt32Array_Impl__obj();
	_result_->__construct();
	return _result_;}

Dynamic UInt32Array_Impl__obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< UInt32Array_Impl__obj > _result_ = new UInt32Array_Impl__obj();
	_result_->__construct();
	return _result_;}

::haxe::io::ArrayBufferViewImpl UInt32Array_Impl__obj::fromData( ::haxe::io::ArrayBufferViewImpl d){
	HX_STACK_FRAME("haxe.io._UInt32Array.UInt32Array_Impl_","fromData",0x4547640f,"haxe.io._UInt32Array.UInt32Array_Impl_.fromData","/usr/share/haxe/std/haxe/io/UInt32Array.hx",68,0xfcf50079)
	HX_STACK_ARG(d,"d")
	HX_STACK_LINE(69)
	::haxe::io::ArrayBufferViewImpl tmp = d;		HX_STACK_VAR(tmp,"tmp");
	HX_STACK_LINE(69)
	return tmp;
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(UInt32Array_Impl__obj,fromData,return )

::haxe::io::ArrayBufferViewImpl UInt32Array_Impl__obj::fromBytes( ::haxe::io::Bytes bytes,hx::Null< int >  __o_bytePos,Dynamic length){
int bytePos = __o_bytePos.Default(0);
	HX_STACK_FRAME("haxe.io._UInt32Array.UInt32Array_Impl_","fromBytes",0x424022e6,"haxe.io._UInt32Array.UInt32Array_Impl_.fromBytes","/usr/share/haxe/std/haxe/io/UInt32Array.hx",81,0xfcf50079)
	HX_STACK_ARG(bytes,"bytes")
	HX_STACK_ARG(bytePos,"bytePos")
	HX_STACK_ARG(length,"length")
{
		HX_STACK_LINE(82)
		::haxe::io::ArrayBufferViewImpl tmp;		HX_STACK_VAR(tmp,"tmp");
		HX_STACK_LINE(82)
		{
			HX_STACK_LINE(82)
			::haxe::io::Bytes tmp1 = bytes;		HX_STACK_VAR(tmp1,"tmp1");
			HX_STACK_LINE(82)
			int tmp2 = bytePos;		HX_STACK_VAR(tmp2,"tmp2");
			HX_STACK_LINE(82)
			bool tmp3 = (length == null());		HX_STACK_VAR(tmp3,"tmp3");
			HX_STACK_LINE(82)
			Dynamic tmp4;		HX_STACK_VAR(tmp4,"tmp4");
			HX_STACK_LINE(82)
			if ((tmp3)){
				HX_STACK_LINE(82)
				int tmp5 = (bytes->length - bytePos);		HX_STACK_VAR(tmp5,"tmp5");
				HX_STACK_LINE(82)
				tmp4 = (int(tmp5) >> int((int)2));
			}
			else{
				HX_STACK_LINE(82)
				tmp4 = length;
			}
			HX_STACK_LINE(82)
			int tmp5 = (int(tmp4) << int((int)2));		HX_STACK_VAR(tmp5,"tmp5");
			HX_STACK_LINE(82)
			::haxe::io::ArrayBufferViewImpl tmp6 = ::haxe::io::_ArrayBufferView::ArrayBufferView_Impl__obj::fromBytes(tmp1,tmp2,tmp5);		HX_STACK_VAR(tmp6,"tmp6");
			HX_STACK_LINE(82)
			::haxe::io::ArrayBufferViewImpl this1 = tmp6;		HX_STACK_VAR(this1,"this1");
			HX_STACK_LINE(82)
			tmp = this1;
		}
		HX_STACK_LINE(82)
		::haxe::io::ArrayBufferViewImpl tmp1 = ::haxe::io::_UInt32Array::UInt32Array_Impl__obj::fromData(tmp);		HX_STACK_VAR(tmp1,"tmp1");
		HX_STACK_LINE(82)
		return tmp1;
	}
}


STATIC_HX_DEFINE_DYNAMIC_FUNC3(UInt32Array_Impl__obj,fromBytes,return )


UInt32Array_Impl__obj::UInt32Array_Impl__obj()
{
}

bool UInt32Array_Impl__obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 8:
		if (HX_FIELD_EQ(inName,"fromData") ) { outValue = fromData_dyn(); return true;  }
		break;
	case 9:
		if (HX_FIELD_EQ(inName,"fromBytes") ) { outValue = fromBytes_dyn(); return true;  }
	}
	return false;
}

#if HXCPP_SCRIPTABLE
static hx::StorageInfo *sMemberStorageInfo = 0;
static hx::StaticInfo *sStaticStorageInfo = 0;
#endif

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(UInt32Array_Impl__obj::__mClass,"__mClass");
};

#ifdef HXCPP_VISIT_ALLOCS
static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(UInt32Array_Impl__obj::__mClass,"__mClass");
};

#endif

hx::Class UInt32Array_Impl__obj::__mClass;

static ::String sStaticFields[] = {
	HX_HCSTRING("fromData","\xb4","\x24","\x2f","\xa0"),
	HX_HCSTRING("fromBytes","\xa1","\xf2","\x20","\x72"),
	::String(null()) };

void UInt32Array_Impl__obj::__register()
{
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_HCSTRING("haxe.io._UInt32Array.UInt32Array_Impl_","\x73","\x78","\x4d","\x5a");
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &UInt32Array_Impl__obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mMarkFunc = sMarkStatics;
	__mClass->mStatics = hx::Class_obj::dupFunctions(sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< UInt32Array_Impl__obj >;
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

} // end namespace haxe
} // end namespace io
} // end namespace _UInt32Array
