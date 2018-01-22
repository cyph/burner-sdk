#ifndef INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_
#define INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS2(haxe,io,ArrayBufferViewImpl)
HX_DECLARE_CLASS2(haxe,io,Bytes)
HX_DECLARE_CLASS3(haxe,io,_ArrayBufferView,ArrayBufferView_Impl_)
namespace haxe{
namespace io{
namespace _ArrayBufferView{


class HXCPP_CLASS_ATTRIBUTES  ArrayBufferView_Impl__obj : public hx::Object{
	public:
		typedef hx::Object super;
		typedef ArrayBufferView_Impl__obj OBJ_;
		ArrayBufferView_Impl__obj();
		Void __construct();

	public:
		inline void *operator new( size_t inSize, bool inContainer=false,const char *inName="haxe.io._ArrayBufferView.ArrayBufferView_Impl_")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		static hx::ObjectPtr< ArrayBufferView_Impl__obj > __new();
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~ArrayBufferView_Impl__obj();

		HX_DO_RTTI_ALL;
		static bool __GetStatic(const ::String &inString, Dynamic &outValue, hx::PropertyAccess inCallProp);
		static void __register();
		::String __ToString() const { return HX_HCSTRING("ArrayBufferView_Impl_","\x7e","\xc5","\xf5","\xc2"); }

		static ::haxe::io::ArrayBufferViewImpl fromBytes( ::haxe::io::Bytes bytes,hx::Null< int >  pos,Dynamic length);
		static Dynamic fromBytes_dyn();

};

} // end namespace haxe
} // end namespace io
} // end namespace _ArrayBufferView

#endif /* INCLUDED_haxe_io__ArrayBufferView_ArrayBufferView_Impl_ */ 
