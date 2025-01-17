// Copyright 2018 The Beam Team
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.mw.beam.beamwallet.core.entities.dto;

public class TxDescriptionDTO
{
	public String id;
	public long amount;
	public long fee;
	public long change;
	public long minHeight;
	public String peerId;
	public String myId;
	public String message;
	public long createTime;
	public long modifyTime;
	public boolean sender;
    public boolean selfTx;
	public int status;
    public String kernelId;
	public int failureReason;
	public String identity;
	public boolean isPublicOffline;
    public boolean isMaxPrivacy;
    public boolean isShielded;
	public int assetId;
    public boolean isDapps;
	public String appName;
	public String appID;
	public String contractCids;
}
